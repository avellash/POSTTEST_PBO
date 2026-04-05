public class Peserta {

    protected String nama;
    protected int umur;
    protected String negara;

    public Peserta(String nama, int umur, String negara) {
        this.nama = nama;
        this.umur = umur;
        this.negara = negara;
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

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }
}