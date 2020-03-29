package task27;

//      Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

import java.util.*;

public class CollectionHandler {

    HashSet<Integer> set;

    HashSet doublesKiller(ArrayList incomingList) {

        set = new HashSet<>(incomingList);
        incomingList.clear();
        incomingList.addAll(set);

        return set;
    }
}
