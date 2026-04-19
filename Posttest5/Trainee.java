public class Trainee extends Peserta implements Aktivitas {

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

    @Override
    public void tampilInfo() {
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Negara : " + negara);
        System.out.println("Posisi : " + posisi);
    }

    @Override
    public void latihan() {
        System.out.println(nama + " sedang latihan.");
    }

    @Override
    public void perform() {
        System.out.println(nama + " tampil di panggung.");
    }
}