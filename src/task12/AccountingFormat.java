package task12;

//      Имеется целое число, следует вывести его в бухгалтерском формате. Т.е. начиная справа каждые три позиции отделяются пробелом.
//      Например, число 20023143 должно быть выведено как 20 023 143.

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class AccountingFormat {

    public static void main(String[] args) {

        AccountingFormat accFor = new AccountingFormat();
        accFor.reformer();
    }

    int usersInput() {

        int accValue = 0;
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Please, enter integer value!");
            accValue = scn.nextInt();
            scn.close();

        } catch(InputMismatchException ex) {

            System.out.println("Please, next time enter integer value.");
        }
        return accValue;
    }

    int reformer() {

        StringBuffer verifiable = new StringBuffer(usersInput());
        verifiable.reverse();
        String verifyingString  = verifiable.toString();
        String[] stringArray = verifyingString.split("");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }


        return 0;
    }
}
