import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetSimilarityCheckerTest {

    AlphabetSimilarityChecker sc;

    @BeforeEach
    void setUp() {
        sc = new AlphabetSimilarityChecker();
    }

    @Test
    public void capitalTest(){
        getAlphabetSccore(0, "aA", "AAE");
    }

    @Test
    public void maxScoreTest(){
        getAlphabetSccore(40, "ASD", "DSA");
        getAlphabetSccore(40, "AAABB", "BAA");
    }

    @Test
    public void minScoreTest(){
        getAlphabetSccore(0, "A", "BB");
        getAlphabetSccore(0, "DFJKASDF", "BBBBBBB");
    }

    @Test
    public void partialScoreTest(){
        getAlphabetSccore(20, "AA", "AAE");
    }

    private void getAlphabetSccore(int expected, String strA, String strB) {
        sc = new AlphabetSimilarityChecker();
        assertEquals(expected, sc.getAlphabetScore(strA, strB));
    }

}