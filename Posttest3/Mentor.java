public class Mentor extends Peserta {

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
}