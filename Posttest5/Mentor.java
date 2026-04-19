public class Mentor extends Peserta implements Aktivitas {

    private String spesialis;

    public Mentor(String nama, int umur, String negara, String spesialis) {
        super(nama, umur, negara);
        this.spesialis = spesialis;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Nama       : " + nama);
        System.out.println("Umur       : " + umur);
        System.out.println("Negara     : " + negara);
        System.out.println("Spesialis  : " + spesialis);
    }

    @Override
    public void latihan() {
        System.out.println(nama + " sedang melatih trainee.");
    }

    @Override
    public void perform() {
        System.out.println(nama + " memberi evaluasi perform.");
    }
}