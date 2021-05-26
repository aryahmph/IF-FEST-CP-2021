package aryahmph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KalkulatorTest {
    @Test
    void test1_1() {
        Assertions.assertEquals(5, KalkulatorSolution.kalkulator("2 3 +"));
    }

    @Test
    void test1_2() {
        Assertions.assertEquals(10, KalkulatorSolution.kalkulator("2 3 + 5 +"));
    }

    @Test
    void test1_3() {
        Assertions.assertEquals(12, KalkulatorSolution.kalkulator("2 3 + 5 + 2 +"));
    }

    @Test
    void test2_1() {
        Assertions.assertEquals(4, KalkulatorSolution.kalkulator("5 1 -"));
    }

    @Test
    void test2_2() {
        Assertions.assertEquals(-6, KalkulatorSolution.kalkulator("5 1 - -10 +"));
    }

    @Test
    void test2_3() {
        Assertions.assertEquals(-2, KalkulatorSolution.kalkulator("-1 1 - 1 + -1 +"));
    }

    @Test
    void test3_1() {
        Assertions.assertEquals(741, KalkulatorSolution.kalkulator("1 2 * 3 * 4 * 5 * 6 * 1 + 2 + 3 + 4 + 5 + 6 +"));
    }

    @Test
    void test3_2() {
        Assertions.assertEquals(4, KalkulatorSolution.kalkulator("1 2 * 3 * 4 * 0 * 6 * 1 + 2 + 3 + -1 + 5 + 6 -"));
    }

    @Test
    void test3_3() {
        Assertions.assertEquals(15, KalkulatorSolution.kalkulator("2 3 - 5 * -10 + -1 *"));
    }
}
