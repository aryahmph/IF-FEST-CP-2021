package aryahmph;

import java.util.Scanner;

public class Dadu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            System.out.println(DaduSolution.kejadianDadu(value));
        }
    }
}
