package task30;

//      Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.

import java.io.*;

public class Main {

    public static void main(String[] args) {

        NewFile newFile = new NewFile();
        ReadFile readFile = new ReadFile();
        Calculator calculator = new Calculator();

        File textFile = new File("Text.txt");

        newFile.createFile(textFile);

        String textFromFile = readFile.readFromFile(textFile);
        System.out.println(textFromFile);
        System.out.println("Punctuations value is: " + calculator.dotsCounter(textFromFile));
        System.out.println("Words value is: " + calculator.wordsCounter(textFromFile));
    }
}
