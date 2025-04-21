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
        System.out.println("Nama         : " + kontakAnggota.getNamaLengkap());
        System.out.println("Jenis Kelamin: " + kontakAnggota.getJenisKelamin());
        System.out.println("Alamat       : " + kontakAnggota.getAlamat());
        System.out.println("Telepon      : " + kontakAnggota.getNomorTelepon());
        System.out.println("Email        : " + kontakAnggota.getEmail());
        System.out.println("Kode Anggota : " + keanggotaan.getKodeAnggota());
        System.out.println("Tanggal Gabung: " + keanggotaan.getTanggalGabung());
        System.out.println("Status Aktif : " + keanggotaan.isStatusAktif());
        System.out.println("Tingkat      : " + keanggotaan.getTingkatKeanggotaan());
        System.out.println("Buku Dipinjam: " + statistikAktivitas.getJumlahBukuDipinjam());
        System.out.println("Terlambat    : " + statistikAktivitas.getJumlahTerlambat());
        System.out.println("Denda        : Rp " + statistikAktivitas.getJumlahDenda());
        System.out.println("Poin         : " + statistikAktivitas.getPoinLoyalitas());
        System.out.println("Kode Referal : " + preferensiPengguna.getKodeReferal());
        System.out.println("Langganan Buletin: " + preferensiPengguna.getLanggananBuletin());
        System.out.println("Skor Risiko : " + hitungSkorRisiko());
        System.out.println("Layak Upgrade?: " + periksaKelayakanUpgrade());
        System.out.println("===========================");
    }

    public boolean periksaKelayakanUpgrade() {
        if (keanggotaan.getTingkatKeanggotaan().equals("DASAR") && statistikAktivitas.getPoinLoyalitas() > 100) {
            return true;
        }
        return false;
    }

    public double hitungSkorRisiko() {
        double skor = 0;
        skor += statistikAktivitas.getJumlahTerlambat() * 1.5;
        skor += statistikAktivitas.getJumlahDenda() * 0.1;
        if (!keanggotaan.isStatusAktif())
            skor += 5;
        if (keanggotaan.getTingkatKeanggotaan().equals("DASAR"))
            skor += 2;
        if (statistikAktivitas.getJumlahBukuDipinjam() > 50)
            skor -= 1.5;
        return skor;
    }
}
