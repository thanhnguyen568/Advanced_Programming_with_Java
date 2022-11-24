package ss16_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileDemo {

    public List<Integer> readFile(String filePath) {
        List<Integer> list = new ArrayList<>();

        //Specify the path of the file here
        File file = new File("D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\file\\myfile.txt");
        BufferedInputStream bis = null;
        FileInputStream fis = null;

        try {
            //FileInputStream to read the file
            fis = new FileInputStream(file);

            /*Passed the FileInputStream to BufferedInputStream
             *For Fast read using the buffer array.*/
            bis = new BufferedInputStream(fis);

            /*available() method of BufferedInputStream
             * returns 0 when there are no more bytes
             * present in the file to be read*/
            while (bis.available() > 0) {
                System.out.print((char) bis.read());
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("The specified file not found" + fnfe);
        } catch (IOException ioe) {
            System.out.println("I/O Exception: " + ioe);
        } finally {
            try {
                if (bis != null && fis != null) {
                    fis.close();
                    bis.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
        return list;
    }

    public void writeFile(String filePath) {
        FileOutputStream fos = null;
        File file;
        String mycontent = "This is my Data which needs" +
                " to be written into the file";
        try {
            //Specify the file path here
            file = new File("D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\file\\myfile.txt");
            fos = new FileOutputStream(file);

            /* This logic will check whether the file
             * exists or not. If the file is not found
             * at the specified location it would create
             * a new file*/
            if (!file.exists()) {
                file.createNewFile();
            }

            /*String content cannot be directly written into
             * a file. It needs to be converted into bytes
             */
            byte[] bytesArray = mycontent.getBytes();

            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the Stream");
            }
        }

    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> list = readAndWriteFile.readFile("D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\file\\numbers.txt");

        readAndWriteFile.writeFile("D:\\CodeGym\\Module2_Advanced_Programming_with_Java\\src\\file\\result.txt");
    }
}
