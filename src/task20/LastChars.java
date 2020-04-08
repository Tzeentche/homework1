package task20;

//      Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.

import java.util.*;

public class LastChars {

    public static void main(String[] args) {

        LastChars lastChars = new LastChars();
        String usersInput = lastChars.usersSentence();
        StringBuilder resultWordIs = lastChars.concatenator(usersInput);
        lastChars.outputResult(resultWordIs);
    }

    String usersSentence() {
        String sentence = "";
        Scanner scn = new Scanner(System.in);

        System.out.println("Please, enter your sentence with some value of words:");
        try {
            sentence = scn.nextLine();
            scn.close();

        } catch (InputMismatchException ex) {

            System.out.println("Your input was wrong! Please, next time be more carefully and enter correct sentence.");
        }
        return sentence;
    }

    StringBuilder concatenator(String incomingCharsArray) {
        StringBuilder concatResult = new StringBuilder();

        for(int i = 0; i < incomingCharsArray.length(); i++) {

            if(incomingCharsArray.charAt(i) != ' ' && (incomingCharsArray.charAt(i + 1) != incomingCharsArray.length() - 1 && incomingCharsArray.charAt(i + 1) == ' '))
                concatResult.insert(concatResult.length(), incomingCharsArray.charAt(i));
        }
        return concatResult;
    }

    void outputResult(StringBuilder resultIs) {
        System.out.println("Text, consists with all last chars of Users's sentence is \"" + resultIs + "\".");
    }
}
