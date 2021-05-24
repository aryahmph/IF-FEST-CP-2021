package aryahmph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JumlahSkorTest {
  @Test
  void test1() {
    int res = JumlahSkorSolution.jumlahSkor(6, 5, 1);
    assertEquals(45, res);
  }

  @Test
  void test2() {
    int res = JumlahSkorSolution.jumlahSkor(5, 10, 5);
    assertEquals(100, res);
  }

  @Test
  void test3() {
    int res = JumlahSkorSolution.jumlahSkor(10, 10, 5);
    System.out.println(res);
  }

  @Test
  void test4() {
    int res = JumlahSkorSolution.jumlahSkor(7, 2, 3);
    System.out.println(res);
  }

  @Test
  void test5() {
    int res = JumlahSkorSolution.jumlahSkor(50, 1, 1);
    System.out.println(res);
  }

  @Test
  void test6() {
    int res = JumlahSkorSolution.jumlahSkor(100, 5, 10);
    System.out.println(res);
  }

  @Test
  void test7() {
    int res = JumlahSkorSolution.jumlahSkor(20, 100, 30);
    System.out.println(res);
  }

  @Test
  void test8() {
    int res = JumlahSkorSolution.jumlahSkor(2, 100, 100);
    System.out.println(res);
  }

  @Test
  void test9() {
    int res = JumlahSkorSolution.jumlahSkor(200, 1, 1);
    System.out.println(res);
  }

  @Test
  void test10() {
    int res = JumlahSkorSolution.jumlahSkor(201, 2, 2);
    System.out.println(res);
  }

  @Test
  void test11() {
    int res = JumlahSkorSolution.jumlahSkor(500, 5, 2);
    System.out.println(res);
  }
}
