import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {

    @Test
    public void getAlphabetScore(){
        SimilarityChecker sc = new SimilarityChecker();
        assertEquals(0, sc.getAlphabetScore("aA", "AAE"));
    }
}