package task12;

//      Имеется целое число, следует вывести его в бухгалтерском формате. Т.е. начиная справа каждые три позиции отделяются пробелом.
//      Например, число 20023143 должно быть выведено как 20 023 143.

import java.util.*;

public class AccountingFormat {

    public static void main(String[] args) {

        AccountingFormat accFor = new AccountingFormat();
        System.out.println(accFor.reformer());
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

    StringBuffer reformer() {

        StringBuffer verifiable = new StringBuffer();

        StringBuffer boofer = new StringBuffer();
        boofer.append(usersInput());
        boofer.reverse();

        String verifyingString  = boofer.toString();
        String[] stringArray = verifyingString.split("");

        for (int i = 0; i < stringArray.length; i++) {
            verifiable.append(stringArray[i]);

            if ((i == 2) | (i == 5) | (i == 8) | (i == 11) | (i == 14) | (i == 17) | (i == 20)) {
                verifiable.append(" ");
            }
        }
        verifiable.reverse();

        return verifiable;
    }
}
