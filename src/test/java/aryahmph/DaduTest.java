package aryahmph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaduTest {
    @Test
    void test0_1() {
        Assertions.assertEquals(30, DaduSolution.kejadianDadu(5));
    }

    @Test
    void test0_2() {
        Assertions.assertEquals(-1, DaduSolution.kejadianDadu(13));
    }

    @Test
    void test1_1() {
        Assertions.assertEquals(6, DaduSolution.kejadianDadu(10));
    }

    @Test
    void test1_2() {
        Assertions.assertEquals(3, DaduSolution.kejadianDadu(11));
    }

    @Test
    void test1_3() {
        Assertions.assertEquals(1, DaduSolution.kejadianDadu(12));
    }

    @Test
    void test2_1() {
        Assertions.assertEquals(21, DaduSolution.kejadianDadu(7));
    }

    @Test
    void test2_2() {
        Assertions.assertEquals(15, DaduSolution.kejadianDadu(8));
    }

    @Test
    void test2_3() {
        Assertions.assertEquals(10, DaduSolution.kejadianDadu(9));
    }

    @Test
    void test2_4() {
        Assertions.assertEquals(-1, DaduSolution.kejadianDadu(0));
    }

    @Test
    void test3_1() {
        Assertions.assertEquals(36, DaduSolution.kejadianDadu(2));
    }

    @Test
    void test3_2() {
        Assertions.assertEquals(35, DaduSolution.kejadianDadu(3));
    }

    @Test
    void test3_3() {
        Assertions.assertEquals(33, DaduSolution.kejadianDadu(4));
    }

    @Test
    void test3_4() {
        Assertions.assertEquals(30, DaduSolution.kejadianDadu(5));
    }
}
