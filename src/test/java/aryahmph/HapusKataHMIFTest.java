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

}
