package models;

public class Kontak {
    private String namaLengkap;
    private JenisKelamin jenisKelamin;
    private String alamat;
    private String nomorTelepon;
    private String email;

    public Kontak(String namaLengkap, JenisKelamin jenisKelamin, String alamat, String nomorTelepon, String email) {
        this.namaLengkap = namaLengkap;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    public void detail(){
        System.out.println("Nama         : " + namaLengkap);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Telepon      : " + nomorTelepon);
        System.out.println("Email        : " + email);
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
