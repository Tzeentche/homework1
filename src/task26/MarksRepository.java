package task26;

//      Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//      Удалить неудовлетворительные оценки из списка.

import java.util.*;

public class MarksRepository {

    ArrayList<Integer> marksStorage = new ArrayList<>();

    ArrayList<Integer> arrayListFiller(int size) {

        for (int i = 0; i < size; i++) {
            marksStorage.add(i, (int)(Math.random() * 10 + 1));
        }
        System.out.println("Our group students have next marks: ");
        System.out.println(marksStorage);
        return marksStorage;
    }
}
