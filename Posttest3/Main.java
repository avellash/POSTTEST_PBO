import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Trainee> daftarPeserta = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // DATA AWAL
        daftarPeserta.add(new Trainee("Jungwon", 20, "Korea", "Vocal"));
        daftarPeserta.add(new Trainee("Niki", 18, "Jepang", "Dance"));

        int pilihan;

        do {
            System.out.println("\n===== SISTEM MANAJEMEN DATA I-LAND 2 =====");
            System.out.println("1. Tambah Peserta");
            System.out.println("2. Tampilkan Peserta");
            System.out.println("3. Update Peserta");
            System.out.println("4. Hapus Peserta");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahPeserta();
                    break;

                case 2:
                    tampilPeserta();
                    break;

                case 3:
                    updatePeserta();
                    break;

                case 4:
                    hapusPeserta();
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 5);
    }

    public static void tambahPeserta() {

        System.out.print("Nama Peserta : ");
        String nama = input.nextLine();

        System.out.print("Umur : ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("Negara : ");
        String negara = input.nextLine();

        System.out.println("Pilih Posisi:");
        System.out.println("1. Dance");
        System.out.println("2. Vocal");
        System.out.println("3. Rap");
        System.out.print("Pilihan: ");
        int pilihPosisi = input.nextInt();
        input.nextLine();

        String posisi = "";

        switch (pilihPosisi) {
            case 1:
                posisi = "Dance";
                break;
            case 2:
                posisi = "Vocal";
                break;
            case 3:
                posisi = "Rap";
                break;
            default:
                posisi = "Unknown";
        }

        Trainee pesertaBaru = new Trainee(nama, umur, negara, posisi);
        daftarPeserta.add(pesertaBaru);

        System.out.println("Data peserta berhasil ditambahkan.");
    }

    public static void tampilPeserta() {

        if (daftarPeserta.isEmpty()) {
            System.out.println("Belum ada data peserta.");
            return;
        }

        System.out.println("\n===== DAFTAR PESERTA =====");

        for (int i = 0; i < daftarPeserta.size(); i++) {

            Trainee p = daftarPeserta.get(i);

            System.out.println("Data ke-" + (i + 1));
            System.out.println("Nama   : " + p.getNama());
            System.out.println("Umur   : " + p.getUmur());
            System.out.println("Negara : " + p.getNegara());
            System.out.println("Posisi : " + p.getPosisi());
            System.out.println("------------------------");
        }
    }

    public static void updatePeserta() {

        tampilPeserta();

        if (daftarPeserta.isEmpty()) {
            return;
        }

        System.out.print("Pilih nomor peserta yang akan diupdate: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index >= 0 && index < daftarPeserta.size()) {

            System.out.print("Nama baru : ");
            String nama = input.nextLine();

            System.out.print("Umur baru : ");
            int umur = input.nextInt();
            input.nextLine();

            System.out.print("Negara baru : ");
            String negara = input.nextLine();

            System.out.println("Pilih Posisi Baru:");
            System.out.println("1. Dance");
            System.out.println("2. Vocal");
            System.out.println("3. Rap");
            System.out.print("Pilihan: ");
            int pilihPosisi = input.nextInt();
            input.nextLine();

            String posisi = "";

            switch (pilihPosisi) {
                case 1:
                    posisi = "Dance";
                    break;
                case 2:
                    posisi = "Vocal";
                    break;
                case 3:
                    posisi = "Rap";
                    break;
                default:
                    posisi = "Unknown";
            }

            Trainee p = daftarPeserta.get(index);

            p.setNama(nama);
            p.setUmur(umur);
            p.setNegara(negara);
            p.setPosisi(posisi);

            System.out.println("Data peserta berhasil diperbarui.");

        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    public static void hapusPeserta() {

        tampilPeserta();

        if (daftarPeserta.isEmpty()) {
            return;
        }

        System.out.print("Pilih nomor peserta yang akan dihapus: ");
        int index = input.nextInt() - 1;

        if (index >= 0 && index < daftarPeserta.size()) {

            daftarPeserta.remove(index);
            System.out.println("Data peserta berhasil dihapus.");

        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
}