package task30;

//      Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.

public class Calculator {

    int dotsCounter(String text) {
        String punct = text.replaceAll("[^\\p{P}]", "");
        if (!punct.isBlank()) {
            return punct.length();
        } else return 0;
    }

    int wordsCounter(String text) {
        String noPunct = text.replaceAll("[^A-Za-zА-Яа-я \\s]", "");
        String[] words = noPunct.split("\\s+");
        if (!noPunct.isBlank()) {
            return words.length;
        } else return 0;
    }
}
