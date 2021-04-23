package aryahmph;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class LordOfCrimeTest {

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testLordOfCrime1() {
        String[] names = {"Moriarty", "Ciel", "Albert", "Moriarty", "Moriarty"};
        String res = LordOfCrimeSolution.lordOfCrime(names);
    }
}
