package models;

public class LibraryMember {
    private Kontak kontakAnggota;
    private Keanggotaan keanggotaan;
    private StatistikAktivitas statistikAktivitas;
    private PreferensiPengguna preferensiPengguna;

    public LibraryMember(Kontak kontak, String jenisKelamin,
            Keanggotaan keanggotaan, StatistikAktivitas statistikAktivitas,
            PreferensiPengguna preferensiPengguna) {
        this.kontakAnggota = kontak;
        this.keanggotaan = keanggotaan;
        this.statistikAktivitas = statistikAktivitas;
        this.preferensiPengguna = preferensiPengguna;
    }

    public void cetakProfilLengkap() {
        System.out.println("===== PROFIL ANGGOTA =====");
        kontakAnggota.detail();
        keanggotaan.detail();
        preferensiPengguna.detail();
        System.out.println("===========================");
    }

    public boolean periksaKelayakanUpgrade() {
        return keanggotaan.layakDilihatDariLevel() && statistikAktivitas.getPoinLoyalitas() > 100;
    }

    public double hitungSkorRisiko() {
        return RisikoKalkulator.hitung(keanggotaan, statistikAktivitas);
    }
}
