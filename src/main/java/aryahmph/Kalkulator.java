package aryahmph;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            System.out.println(KalkulatorSolution.kalkulator(input));
        }
    }
}
