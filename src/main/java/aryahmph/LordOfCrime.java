package aryahmph;

import java.util.Scanner;

public class LordOfCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
        }

        String[] nameResult = LordOfCrimeSolution.lordOfCrime(names);
        System.out.println(nameResult);
    }

}
