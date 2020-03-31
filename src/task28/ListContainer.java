package task28;

//      Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//      Найти самую высокую оценку с использованием итератора.

import java.util.*;

public class ListContainer {

    ArrayList<Integer> marks = new ArrayList<>();

    ArrayList listFiller(int size) {
        for(int i = 0; i < size; i++) {

            marks.add(i, ((int)(Math.random() * 10 + 1)));
        }

        System.out.println("Students marks is: ");
        System.out.println(marks);

        return marks;
    }
}
