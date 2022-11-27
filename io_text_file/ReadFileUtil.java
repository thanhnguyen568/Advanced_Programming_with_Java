package io_text_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public static List<Animal> readFile(String FILE_PATH) throws IOException {
        List<Animal> animals = new ArrayList<>();
        BufferedReader buff = new BufferedReader(new FileReader(FILE_PATH));

        String line;
        String[] temp;
        Animal animal;

        while ((line = buff.readLine()) != null){
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            String weight = temp[2];

            animal = new Animal(id,name,weight);
            animals.add(animal);
        }

        buff.close();
        return animals;
    }
}
