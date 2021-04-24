package aryahmph;

import java.util.Scanner;

public class HapusKataHMIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int deleted = HapusKataHMIFSolution.hapusKataHMIF(word);
        System.out.println(deleted);
    }
}
