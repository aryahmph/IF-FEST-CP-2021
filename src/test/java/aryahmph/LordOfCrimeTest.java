package aryahmph;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

public class LordOfCrimeTest {

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testLordOfCrime1() {
        String[] names = {"Moriarty", "Ciel", "Albert", "Moriarty", "Moriarty"};
        String[] res = LordOfCrimeSolution.lordOfCrime(names);

        assertArrayEquals(new String[]{"Moriarty", "3"}, res);
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testLordOfCrime2() {
        String[] names = {"Ciel", "Ciel"};
        String[] res = LordOfCrimeSolution.lordOfCrime(names);

        assertArrayEquals(new String[]{"Ciel", "2"}, res);
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testLordOfCrime3() {
        String[] names = {"Charles", "Ciel", "Ciel", "Albert", "Albert", "Albert", "Albert", "Albert",
                "Albert", "Albert", "Albert", "Albert"};
        String[] res = LordOfCrimeSolution.lordOfCrime(names);

        assertArrayEquals(new String[]{"Albert", "9"}, res);

    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testLordOfCrime4() {
        String[] names = {"William", "William", "Charles", "Ciel", "William", "William", "Ciel", "William", "Ciel", "Ciel", "William", "William", "Ciel", "William", "Ciel", "William", "Ciel", "William", "William", "Ciel", "Ciel", "Charles", "Ciel", "William", "Ciel", "William", "Ciel", "William", "William", "Charles", "William", "Ciel", "William", "William", "William", "William", "Charles", "Ciel", "Ciel", "Ciel", "William", "William", "Ciel", "William", "Charles", "William", "William", "Ciel", "William", "Charles", "Moriarty", "William", "Moriarty", "William", "William", "William", "William", "William", "William", "Ciel", "William", "William", "William", "Moriarty", "Charles", "William", "Ciel", "William", "William", "William"};
        // William 40, Ciel = 20, Moriarty = 3, Charles = 7
        String[] res = LordOfCrimeSolution.lordOfCrime(names);

        assertArrayEquals(new String[]{"William", "40"}, res);

    }
}
