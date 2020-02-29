package task9;

//      Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа

import java.util.*;

public class OnceMoreFactorial {

    public static void main(String[] args) {

        long fac = 1;
        int i = 1;
        while(i < 59) {

            fac *= i;
            i++;
        }

        System.out.println("Factorial is: " + fac);
    }
}
