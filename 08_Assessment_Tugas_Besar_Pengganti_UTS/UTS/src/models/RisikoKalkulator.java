package models;

public class RisikoKalkulator {

    // Constants to replace magic numbers
    private static final double BOBOT_TERLAMBAT = 1.5;
    private static final double BOBOT_DENDA = 0.1;
    private static final double PENALTI_STATUS_NONAKTIF = 5;
    private static final double PENALTI_LEVEL_DASAR = 2;
    private static final double PENALTI_BUKU_BANYAK = 1.5;

    public static double hitung(Keanggotaan keanggotaan, StatistikAktivitas statistik) {
        double skor = 0;

        skor += statistik.getJumlahTerlambat() * BOBOT_TERLAMBAT;
        skor += statistik.getJumlahDenda() * BOBOT_DENDA;

        if (!keanggotaan.isStatusAktif()) {
            skor += PENALTI_STATUS_NONAKTIF;
        }

        if (keanggotaan.layakDilihatDariLevel()) {
            skor += PENALTI_LEVEL_DASAR;
        }

        if (statistik.getJumlahBukuDipinjam() > 50) {
            skor -= PENALTI_BUKU_BANYAK;
        }

        return skor;
    }
}