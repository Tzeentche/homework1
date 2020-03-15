package task23;

import java.util.*;

public class DepositOperations {

    Scanner scn = new Scanner(System.in);
    public int usersDeposite = 0;

    public int getUsersDeposite() {
        return usersDeposite;
    }

    private int billWorker() {

        while (true) {
            System.out.println("Please, dial an amount, equals 20 or 50 or 100:");
            if (scn == null) {
                scn = new Scanner(System.in);

                int usersMoney = 0;

                try {
                    usersMoney = scn.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Please, dial Integer value, equals 20 or 50 or 100!");
                }

                if (usersMoney == 20 || usersMoney == 50 || usersMoney == 100) {
                    return usersMoney;

                } else {
                    System.out.println("Please, dial Integer value, equals 20 or 50 or 100:");
                }
            }
        }
    }

    public int depositeMoney() {
        int depositIncrement = billWorker();
        return usersDeposite += depositIncrement;
    }

    public int withdrawMoney() {
        int depositIncrement = billWorker();
        if(depositIncrement < usersDeposite){
            return usersDeposite -= depositIncrement;
        }
        else return 0;
    }
}
