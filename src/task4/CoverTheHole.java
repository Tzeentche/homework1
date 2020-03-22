package task4;

//      Имеется прямоугольное отверстие размерами a и b, определить, может ли его полностью закрыть круглой картонкой радиусом r.

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class CoverTheHole {

    public static void main(String[] args) {

        double[] values = new double[3];
        String[] arr = new String[]{"Length", "Width", "Radius"};

        Scanner input = new Scanner(System.in);

        try {

            for (int i = 0; i < arr.length; i ++) {
                System.out.println("Please, enter size for " + arr[i] + ":");
                values[i] = input.nextDouble();

                if(values[i] < 0) {
                    System.out.println("Size cannot be negative. Most likely you mistakenly entered \"-\". We fixed it.");
                    values[i] *= -1;
                }
            }

            if(
                    ((values[0] * values[0]) + (values[1] * values[1])) <= (values[2] * 2) * (values[2] * 2)) {

                System.out.println("Your circle completely covers the rectangle.");
            } else{

                System.out.println("Your circle don't covers the rectangle.");
                input.close();
            }

        } catch(InputMismatchException ex) {

            System.out.println("Everything is going wrong. Let's try again!");
        }
    }
}
