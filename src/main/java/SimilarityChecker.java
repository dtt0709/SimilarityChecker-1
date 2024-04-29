import java.util.ArrayList;

import static java.lang.Math.*;

public class SimilarityChecker {


    public static final int LENGTH_MAX_SCORE = 60;
    public static final int LENGTH_ZERO_SCORE = 0;

    public int getLengthScore(String strA, String strB) {

        if(strA.length() == strB.length())
            return LENGTH_MAX_SCORE;

        int longStringLength = max(strA.length(), strB.length());
        int shortStringLength = min(strA.length(), strB.length());

        if(isLongerStringLenghtDoubledOrMore(longStringLength, shortStringLength)){
            return LENGTH_ZERO_SCORE;
        }

        return getLengthScore(longStringLength, shortStringLength);
    }

    private static int getLengthScore(int longStringLength, int shortStringLength) {
        return LENGTH_MAX_SCORE - ((longStringLength - shortStringLength) * LENGTH_MAX_SCORE) / shortStringLength;
    }

    private static boolean isLongerStringLenghtDoubledOrMore(int longStringLength, int shortStringLength) {
        return longStringLength >= (shortStringLength * 2);
    }
}
