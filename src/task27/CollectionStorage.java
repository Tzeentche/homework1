package task27;

//      Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

import java.util.*;

public class CollectionStorage {

    ArrayList<Integer> randomValues = new ArrayList();

    ArrayList valuesStorage(int size) {
        for(int i = 0; i < size; i++) {
            randomValues.add(i, (int)(Math.random() * 10 + 1));
        }

        System.out.println("Our collection with random values is: ");
        System.out.println(randomValues);

        return randomValues;
    }
}
