package aryahmph;

public class JumlahSkorSolution {
    public static int jumlahSkor(int jumlahSoal, int skorAwal, int k) {
        return jumlahSoal * (2 * skorAwal + (jumlahSoal - 1) * k) / 2;
    }
}
