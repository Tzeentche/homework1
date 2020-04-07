package task31;

import java.io.*;

public class ReadTextFromFile {

    String readText(File file) {
        StringBuilder stringBuilder = new StringBuilder();

        StringBuilder StringBuilder = new StringBuilder();
        if (!file.exists()) {
            String text = "1 Мы сотрудничаем с 200 представителями 4 IT-индустрии 2 Мы сотрудничаем с 193 представителями IT-индустрии";
            try {
                boolean createNew = file.createNewFile();
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(text);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return readText(file);

        } else {

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line = bufferedReader.readLine();

                while (line != null) {
                    stringBuilder.append(line);
                    stringBuilder.append("\n");
                    line = bufferedReader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return stringBuilder.toString();
        }
    }
}
