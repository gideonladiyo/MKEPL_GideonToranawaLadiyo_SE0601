package models;

public class RisikoKalkulator {
    public static double hitung(Keanggotaan keanggotaan, StatistikAktivitas statistik) {
        double skor = 0;
        skor += statistik.getJumlahTerlambat() * 1.5;
        skor += statistik.getJumlahDenda() * 0.1;
        if (!keanggotaan.isStatusAktif())
            skor += 5;
        if (keanggotaan.layakDilihatDariLevel())
            skor += 2;
        if (statistik.getJumlahBukuDipinjam() > 50)
            skor -= 1.5;
        return skor;
    }
}
