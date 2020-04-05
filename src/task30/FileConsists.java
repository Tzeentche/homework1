package task30;

//      Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.

import java.io.*;
import java.util.ArrayList;

public class FileConsists {

    void readFromFile() {

        String text = new String();
        ArrayList<String[]> textArray = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\JAVA\\Projects\\homework1\\src\\task30\\FileName.txt"));
            int res = reader.read();
            while (res != -1) {
                text = reader.readLine();
                textArray.add(text.split(" "));
                System.out.println((char)res);
                System.out.println(text.toString());
                res = reader.read();
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("There is no file on your path.");
            e.printStackTrace();
        }
    }
}
