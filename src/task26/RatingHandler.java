package task26;

import java.util.ArrayList;

public class RatingHandler {

    ArrayList badMarksKilelr(int minMark, ArrayList marksStorage) {

        for(int i = 0; i < marksStorage.size(); i++) {

            for (int j = 0; j < marksStorage.size(); j++) {

                if ((int) marksStorage.get(j) < minMark) {
                    marksStorage.remove(j);
                }
            }
        }
        return marksStorage;
    }
}
