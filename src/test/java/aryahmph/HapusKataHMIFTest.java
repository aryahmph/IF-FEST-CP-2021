package aryahmph;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class HapusKataHMIFTest {

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testCase1() {
        String word = "HMIF";
        int deleted = HapusKataHMIFSolution.hapusKataHMIF(word);
        assertEquals(1, deleted);
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testCase2() {
        String word = "EHHMIFMIF";
        int deleted = HapusKataHMIFSolution.hapusKataHMIF(word);
        assertEquals(2, deleted);
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testCase3() {
        String word = "HMIFFSHMHMIFIFSADAHMIF";
        int deleted = HapusKataHMIFSolution.hapusKataHMIF(word);
        assertEquals(4, deleted);
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testCase4() {
        String word = "DSALIHWFWMIFHWIFSHFHUEHMIF";
        int deleted = HapusKataHMIFSolution.hapusKataHMIF(word);
        assertEquals(1, deleted);
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testCase5() {
        String word = "HHHHHHHHHHMIFMIFMIFMIFMIFMIFMIFMIFMIFMIF";
        int deleted = HapusKataHMIFSolution.hapusKataHMIF(word);
        assertEquals(10, deleted);
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testCase6() {
        String word = "FHMIHMHMIFFIFFFHMIFF";
        int deleted = HapusKataHMIFSolution.hapusKataHMIF(word);
        assertEquals(2, deleted);
    }

}
