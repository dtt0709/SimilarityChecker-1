import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {

    SimilarityChecker sc;

    @BeforeEach
    void setUp() {
        sc = new SimilarityChecker();
    }

    @Test
    public void getLengthScore(){
        Assertions.assertEquals(30, sc.getLengthScore("AA", "AAE"));
        Assertions.assertEquals(20, sc.getLengthScore("AAABB", "BAA"));
        Assertions.assertEquals(0, sc.getLengthScore("A", "BBB"));
        Assertions.assertEquals(60, sc.getLengthScore("ASD", "DSA"));
    }
}