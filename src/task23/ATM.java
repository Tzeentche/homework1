package task23;

//      Создать класс и объекты, описывающие Банкомат. Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
//      количеством купюр номиналом 20, 50, 100. Сделать методы для добавления денег в банкомат. Сделать функцию, снимающую деньги.
//      На вход передается сумма денег.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    private static int twentythNominalValue;
    private static int fiftythNominalValue;
    private static int hundredthNominalValue;
    int balance;
//
//    public ATM(int billTwenty, int billFifty, int billHundred) {
//        billTwenty = 0;
//        billFifty = 0;
//        billHundred = 0;
//    }

    public static void insertMoney() {

        int[] usersCash = new int[3];
        String[] userInput = {"Twenty bills", "Fifty bills", "Hundred bills"};
        Scanner scn = new Scanner(System.in);

        try {
            for(int i = 0; i < userInput.length; i++) {
                System.out.println("Please, enter " + userInput[i] + ", if you have:");
                usersCash[i] = scn.nextInt();
            }

            scn.close();
        } catch(InputMismatchException ex) {
            System.out.println("Please, next time enter integer value.");
        }
        return accValue;
    }

        billTwenty += twentythNominalValue;
        billFifty += fiftythNominalValue;
        billHundred += hundredthNominalValue;
    }

    public static void takeMoney(int outcomingValue) {
        if(outcomingValue % 10 == 0) {
            System.out.println("You entered wrong value. Please, try again next time, and be more carefully!");
        } else {
            boolean firstAnswer;
            if(hundredthNominalValue * 100 + fiftythNominalValue * 50 + twentythNominalValue * 20 >= outcomingValue) {
                firstAnswer = true;
            } else {
                firstAnswer = false;
                System.out.println("Sorry, bro! You don't have enough money.");
            }
        }
    }
}
