package task29;

//      Имеется текст. Следует составить для него частотный словарь.

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Liba {

    public static void main(String[] args) throws Exception{

        String line;
        BufferedReader reader = new BufferedReader(new FileReader("C:\\JAVA\\Projects\\homework1\\src\\task29\\Text.txt"));
        Map<String, Integer> wordsMap = new HashMap<>();

        while ((line = reader. readLine()) != null) {
            String[] words = line.replaceAll("\\p{Punct}", "").split(" ");
            List<String> wordsList = new ArrayList<>(Arrays.asList(words));

            for (String word : words) {
                wordsMap.put(word, Collections.frequency(wordsList, word));
            }

            System.out.println("We have next result: " + wordsMap);
        }
    }
}