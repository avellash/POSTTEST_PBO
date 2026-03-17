public class Peserta {

    private String nama;
    private int umur;
    private String negara;
    private String posisi;

    public Peserta(String nama, int umur, String negara, String posisi) {
        this.nama = nama;
        this.umur = umur;
        this.negara = negara;
        this.posisi = posisi;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getNegara() {
        return negara;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
}