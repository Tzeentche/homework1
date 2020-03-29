package task27;

//      Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

import java.util.ArrayList;

public class MainRandomValues {

    public static void main(String[] args) {

        UsersDiallog usersDiallog = new UsersDiallog();
        CollectionStorage collectionStorage = new CollectionStorage();
        CollectionHandler collectionHandler = new CollectionHandler();

        int size = usersDiallog.collectionSize();
        ArrayList collection = collectionStorage.valuesStorage(size);
        System.out.println("Now our collection has next view: ");
        System.out.println(collectionHandler.doublesKiller(collection));
    }
}
