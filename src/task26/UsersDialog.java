package task26;

import java.util.*;

public class UsersDialog {

    Scanner scn = new Scanner(System.in);
    int studentsValue = 0;
    int minMark = 0;

    int sizeFinder() {
        System.out.println("Please, enter Integer value (more than 0) of students in your group: ");
        try {
            studentsValue = scn.nextInt();
            if(studentsValue <= 0) {
                System.out.println("Unfortunately, You haven't enough students...");
                System.exit(0);
            }
        } catch (InputMismatchException ex) {
            System.out.println("You entered wrong value. Please, next time enter Integer value more, than 0.");
            System.exit(-1);
        }
        return studentsValue;
    }

    int minMarksLevel() {
        System.out.println("Please, enter Integer value (more than 0 and less than 10) of minimum mark, that students in your group should have: ");
        try {
            minMark = scn.nextInt();
            if(minMark <= 0 | minMark > 10) {
                System.out.println("Unfortunately, our education system operating with marks from 0 to 10.");
                System.exit(0);
            }
            scn.close();
        } catch (InputMismatchException ex) {
            System.out.println("You entered wrong value. Please, next time enter Integer value more, than 0 and less than 10.");
            System.exit(-1);
        }
        return minMark;
    }
}
