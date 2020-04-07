package task30;

import java.io.*;

public class ReadedFile {

        String readFromFile(File file) {
            StringBuilder builder = new StringBuilder();
            try (BufferedReader readFile = new BufferedReader(new FileReader(file))) {
                String line = readFile.readLine();
                while (line != null) {
                    builder.append(line);
                    builder.append("\n");
                    line = readFile.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return builder.toString();
        }
}
