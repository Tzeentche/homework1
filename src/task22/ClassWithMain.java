package task22;

//      Создать класс и объекты, описвающие промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами:
//      секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
//      (метод должен работать аналогично compareTo в строках). Создать два конструктора: получающий общее количество секунд, и
//      часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassWithMain {

    public static void main(String[] args) {

        int[] time = new int[3];
        String[] names = {"Hours", "Minutes", "Seconds"};
        Scanner scn = new Scanner(System.in);

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Please, enter integer " + names[i] + " in format HH:MM:SS :");
                time[i] = scn.nextInt();
            }

        } catch(InputMismatchException ex) {
            System.out.println("You entered wrong value (not Integer). Please, next time be more carefully!");
        }
        TimeInterval obj1 = new TimeInterval(time[0],time[1],time[2]);

        obj1.objectsCompare();
        obj1.returnSeconds();
    }
}
