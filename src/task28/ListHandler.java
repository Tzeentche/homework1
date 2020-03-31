package task28;

//      Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//      Найти самую высокую оценку с использованием итератора.

import java.util.*;

public class ListHandler {

    int max = 0;

    ArrayList maxMarkFinder(ArrayList marks) {
        Iterator<Integer> it;

        for(int i = 0; i < marks.size(); i++) {
            if((int)marks.get(i) > max) {
                max = (int)marks.get(i);
            }
        }

        for (it = marks.iterator(); it.hasNext(); ) {
            if (it.next() < max) {
                it.remove();
            }
        }
        return marks;
    }
}
