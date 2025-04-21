package models;

public class StatistikAktivitas {
    private int jumlahBukuDipinjam;
    private int jumlahTerlambat;
    private int jumlahDenda;
    private int poinLoyalitas;

    public StatistikAktivitas(int jumlahBukuDipinjam,
            int jumlahTerlambat, int jumlahDenda, int poinLoyalitas) {
        this.jumlahBukuDipinjam = jumlahBukuDipinjam;
        this.jumlahTerlambat = jumlahTerlambat;
        this.jumlahDenda = jumlahDenda;
        this.poinLoyalitas = poinLoyalitas;
    }

    public void detail(){
        System.out.println("Buku Dipinjam: " + jumlahBukuDipinjam);
        System.out.println("Terlambat    : " + jumlahTerlambat);
        System.out.println("Denda        : Rp " + jumlahDenda);
        System.out.println("Poin         : " + poinLoyalitas);
    }

    public int getJumlahBukuDipinjam() {
        return jumlahBukuDipinjam;
    }

    public void setJumlahBukuDipinjam(int jumlahBukuDipinjam){
        this.jumlahBukuDipinjam = jumlahBukuDipinjam;
    }

    public int getJumlahTerlambat() {
        return jumlahTerlambat;
    }

    public void setJumlahTerlambat(int jumlahTerlambat) {
        this.jumlahTerlambat = jumlahTerlambat;
    }

    public int getJumlahDenda() {
        return jumlahDenda;
    }

    public void setJumlahDenda(int jumlahDenda) {
        this.jumlahDenda = jumlahDenda;
    }

    public int getPoinLoyalitas() {
        return poinLoyalitas;
    }

    public void setPoinLoyalitas(int poinLoyalitas){
        this.poinLoyalitas = poinLoyalitas;
    }
}
