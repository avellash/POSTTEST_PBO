public class Trainee extends Peserta {

    private String posisi;

    public Trainee(String nama, int umur, String negara, String posisi) {
        super(nama, umur, negara);
        this.posisi = posisi;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
}