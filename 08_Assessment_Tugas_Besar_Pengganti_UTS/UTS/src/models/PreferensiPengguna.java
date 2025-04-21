package models;

public class PreferensiPengguna {
    private String kodeReferal;
    private boolean langgananBuletin;

    public PreferensiPengguna(String kodeReferal, boolean langgananBuletin){
        this.kodeReferal = kodeReferal;
        this.langgananBuletin = langgananBuletin;
    }

    public String getKodeReferal() {
        return kodeReferal;
    }

    public void setKodeReferal(String k) {
        kodeReferal = k;
    }

    public boolean getLanggananBuletin() {
        return langgananBuletin;
    }

    public void setLanggananBuletin(boolean l) {
        langgananBuletin = l;
    }

    public void langgananBuletinPerpustakaan() {
    }

    public void gunakanKodeReferal(String kode) {
    }
}
