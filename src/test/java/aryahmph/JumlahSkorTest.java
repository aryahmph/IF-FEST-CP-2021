package aryahmph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JumlahSkorTest {
    @Test
    void test1() {
        int res = JumlahSkorSolution.jumlahSkor(6,5,1);
        assertEquals(45,res);
    }

    @Test
    void test2() {
        int res = JumlahSkorSolution.jumlahSkor(5,10,5);
        assertEquals(100,res);
    }
}
