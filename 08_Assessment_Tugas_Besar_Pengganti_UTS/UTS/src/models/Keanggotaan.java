package models;

import java.util.Date;

public class Keanggotaan {
    private String kodeAnggota;
    private Date tanggalGabung;
    private boolean statusAktif;
    private String tingkatKeanggotaan;

    public Keanggotaan(String kodeAnggota, Date tanggalGabung, boolean statusAktif,
            String tingkatKeanggotaan) {
        this.kodeAnggota = kodeAnggota;
        this.tanggalGabung = tanggalGabung;
        this.statusAktif = statusAktif;
        this.tingkatKeanggotaan = tingkatKeanggotaan;
    }

    public void detail(){
        System.out.println("Kode Anggota : " + kodeAnggota);
        System.out.println("Tanggal Gabung: " + tanggalGabung);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tingkat      : " + tingkatKeanggotaan);
    }

    public boolean layakDilihatDariLevel(){
        return tingkatKeanggotaan.equals("DASAR");
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public Date getTanggalGabung() {
        return tanggalGabung;
    }

    public void setTanggalGabung(Date tanggalGabung) {
        this.tanggalGabung = tanggalGabung;
    }

    public boolean isStatusAktif() {
        return statusAktif;
    }

    public void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }

    public String getTingkatKeanggotaan() {
        return tingkatKeanggotaan;
    }

    public void setTingkatKeanggotaan(String tingkatKeanggotaan) {
        this.tingkatKeanggotaan = tingkatKeanggotaan;
    }
}
