package ss16_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static int findMax(List<Integer> numbers) {
        try {
            int max = numbers.get(0);
            for (int i = 0; i < numbers.size(); i++) {
                if (max < numbers.get(i)) {
                    max = numbers.get(i);
                }
            }
            return max;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
        return 0;
    }

    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            // Đọc file theo đường dẫn
            File file = new File(filePath);

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Đọc từng dòng của file và tiến hành add phần tử vào List
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\file\\numbers.txt");

        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\file\\result.txt", maxValue);
    }
}
