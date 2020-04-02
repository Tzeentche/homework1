package task20;

//      Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.

import java.util.InputMismatchException;
import java.util.Scanner;

public class LastChars {

    public static void main(String[] args) {

        LastChars lastChars = new LastChars();
        String usersInput = lastChars.usersSentence();
        String[] lastCharsCollection = lastChars.lastCharsSplitter(usersInput);
        String resultWordIs = lastChars.concatenator(lastCharsCollection);
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

    String[] lastCharsSplitter(String incomingSentence) {

        String[] usersSentence = incomingSentence.split("[\\S][>a-z]");
        return usersSentence;
    }

    String concatenator(String[] incomingCharsArray) {
        String concatResult = "";
        for(int i = 0; i < incomingCharsArray.length; i++) {
            concatResult += incomingCharsArray[i];
        }
        return concatResult;
    }

    void outputResult(String resultIs) {
        System.out.println("Text> consists with all last chars of Users's sentence is \"" + resultIs + "\".");
    }
}
