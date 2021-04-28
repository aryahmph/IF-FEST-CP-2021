package aryahmph;

import java.util.Scanner;

public class JumlahSkor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int jumlahSoal = scanner.nextInt();
            int skorAwal = scanner.nextInt();
            int increment = scanner.nextInt();

            System.out.println(JumlahSkorSolution.jumlahSkor(jumlahSoal, skorAwal, increment));
        }
    }
}
