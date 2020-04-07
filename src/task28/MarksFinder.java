package task28;

//      Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//      Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;

public class MarksFinder {

    public static void main(String[] args) {

        UsersInput usersInput = new UsersInput();
        ListContainer listContainer = new ListContainer();
        ListHandler listHandler = new ListHandler();

        int size = usersInput.listCreator();
        ArrayList list = listContainer.listFiller(size);
        System.out.println("Max mark(s) is: ");
        System.out.println(listHandler.maxMarkFinder(list));
    }
}
