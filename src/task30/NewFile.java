package task30;

import java.io.*;

public class NewFile {

    public void createFile(File file) {

        String fileConsist = "Меняем реки, страны, города... Иные двери... Новые года... а никуда нам от себя не деться, а если деться — только в никуда.";

        try (FileWriter writeToFile = new FileWriter(file)) {
            writeToFile.write(fileConsist);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
