package io_text_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {
    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public static void writeAnimalFile(String path, List<Animal> animals) throws IOException {
        String data = "";
        for (Animal animal : animals) {
            data += animal.getInfo();
        }

        writeFile(path, data);
    }
}
