package task26;

//      Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//      Удалить неудовлетворительные оценки из списка.

import java.util.*;

public class MainMarks {

    public static void main(String[] args) {

        UsersDialog usersDialog = new UsersDialog();
        MarksRepository marksRepository = new MarksRepository();
        RatingHandler ratingHandler = new RatingHandler();

        int howManyStudents = usersDialog.sizeFinder();
        int minimumMark = usersDialog.minMarksLevel();
        ArrayList marksList = marksRepository.arrayListFiller(howManyStudents);

        System.out.println("Result marks repository is: " + ratingHandler.badMarksKilelr(minimumMark, marksList));
    }
}
