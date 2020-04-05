package task31;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {

    void readFromFile() {

        String text = new String();
        ArrayList<String[]> textArray = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader("C:\\JAVA\\Projects\\homework1\\src\\task30\\FileName.txt"));

        } catch (IOException e) {
            System.out.println("There is no file on your path.");
            e.printStackTrace();
        }
    }
}
