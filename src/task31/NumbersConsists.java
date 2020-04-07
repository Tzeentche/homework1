package task31;

//      Имеется файл с текстом, в котором присутствуют числа. Нати все числа, распечатать, посчитать сумму,
//      убрать все повторяющиеся числа и снова распечатать.

import java.io.*;
import java.util.*;

public class NumbersConsists {

    public static void main(String[] args) throws Exception {

        File textFile = new File("Text.txt");
        ReadTextFromFile readTextFromFile = new ReadTextFromFile();
        NumbersCalculator numbersCalculator = new NumbersCalculator();
        String text = readTextFromFile.readText(textFile);
        List<String> numbers;
        numbers = numbersCalculator.numbersFinder(text);

        System.out.println("In our text we have next numbers: " + numbers.toString());
        System.out.println("If we plus this numbers, we will have next result: " + numbersCalculator.counter(numbers));
        System.out.println("Most of all, we have next unique numbers: " + numbersCalculator.repeatKiller(numbers));
    }
}
