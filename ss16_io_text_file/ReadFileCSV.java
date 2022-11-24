package ss16_io_text_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    private static final String FILE_PATH = "D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\ss16_io_text_file\\data\\national.csv";

    public static List<National> ReadCSV() throws IOException {
        List<National> nationalList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String[] temp;
        National nationals;

        while ((line = buff.readLine()) != null){
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String code = temp[1];
            String name = temp[2];

            nationals = new National(id,code,name);
            nationalList.add(nationals);
        }
        buff.close();
        return nationalList;
    }

    public static void main(String[] args) throws IOException {
        List<National> nationalList = ReadCSV();

        for (National item: nationalList){
            System.out.println(item);
        }
    }

}
