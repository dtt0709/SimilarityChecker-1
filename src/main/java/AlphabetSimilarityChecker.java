public class AlphabetSimilarityChecker {

    public static final int ALPHABET_MIN_SCORE = 0;
    public static final int ALPHABET_MAX_SCORE = 40;

    public int getAlphabetScore(String strA, String strB) {
        int[] alphaCheck = new int[26];

        if(isNotCapitalAlphabetIncluded(strA, strB)) return ALPHABET_MIN_SCORE;

        strACount(strA, alphaCheck);

        int diffCnt = getDiffCnt(strB, alphaCheck);
        int sameCnt = getSameCnt(strB, alphaCheck);

        if(diffCnt== 0)  return ALPHABET_MAX_SCORE;
        if(sameCnt== 0)  return ALPHABET_MIN_SCORE;

        return getPartialPointForAlphabet(sameCnt, diffCnt);
    }

    private static void strACount(String strA, int[] alphaCheck) {
        for(char charAt: strA.toCharArray()){
            if(alphaCheck[(charAt-'A')]== 0)
                alphaCheck[(charAt-'A')]++;
        }
    }

    private static int getPartialPointForAlphabet(int sameCnt, int diffCnt) {
        return sameCnt * ALPHABET_MAX_SCORE / (diffCnt + sameCnt);
    }

    private static int getSameCnt(String strB, int[] alphaCheck) {
        int result = 0;
        for(char charAt: strB.toCharArray()){
            if(alphaCheck[(charAt-'A')]==1) {
                alphaCheck[(charAt-'A')]++;
                result++;
            }
        }
        return result;
    }

    private static int getDiffCnt(String strB, int[] alphaCheck) {
        int result = 0;
        for(char charAt: strB.toCharArray()){
            if(alphaCheck[(charAt-'A')]== 0) result++;
        }
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
