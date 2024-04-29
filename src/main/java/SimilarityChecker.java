import static java.lang.Math.*;

public class SimilarityChecker {

    public int getAlphabetScore(String strA, String strB) {
        int result = 0;

        if(isNotCapitalAlphabetIncluded(strA, strB))
            return 0;


        return result;
    }

    private boolean isNotCapitalAlphabetIncluded(String strA, String strB) {
        for(char charAt: strA.toCharArray()){
            if(charAt <'A' || charAt > 'Z'){
                return true;
            }
        }
        for(char charAt: strB.toCharArray()){
            if(charAt <'A' || charAt > 'Z'){
                return true;
            }
        }
        return false;
    }
}
