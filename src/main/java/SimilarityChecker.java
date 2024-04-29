import java.util.ArrayList;

public class SimilarityChecker {


    public int getLengthScore(String strA, String strB) {
        String longStr;
        String shortStr;

        if(isStrALongerThanStrB(strA, strB)){
            longStr = strA;
            shortStr = strB;
        }
        else{
            longStr = strB;
            shortStr = strA;
        }

        if(isLongerStringLenghtDoubledOrMore(longStr, shortStr)){
            return 0;
        }

        return (int) Math.round((1 - (((double) (longStr.length() - shortStr.length())) / shortStr.length())) * 60);
    }

    private static boolean isLongerStringLenghtDoubledOrMore(String longStr, String shortStr) {
        return longStr.length() >= (shortStr.length() * 2);
    }

    private static boolean isStrALongerThanStrB(String strA, String strB) {
        return strA.length() > strB.length();
    }
}
