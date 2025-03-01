import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Petshop> daftarProduk = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void tampilkanSemuaProduk() {
        System.out.println("+-----+------------------+------------+------+-----------+---------+--------+--------+------+------------+");
        System.out.printf("| %-3s | %-16s | %-10s | %-4s | %-9s | %-7s | %-6s | %-6s | %-4s | %-10s |\n",
                          "ID", "Nama Produk", "Harga", "Stok", "Jenis", "Bahan", "Warna", "Hewan", "Size", "Merk");
        System.out.println("+-----+------------------+------------+------+-----------+---------+--------+--------+------+------------+");
    
        for (Petshop produk : daftarProduk) {
            produk.tampilkanData();
        }
        
        System.out.println("+-----+------------------+------------+------+-----------+---------+--------+--------+------+------------+");
    }

    public static void tambahProduk() {
        System.out.println("\nTambah Produk Baru");

        System.out.print("Masukkan ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.print("Masukkan Nama Produk: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Harga: ");
        double harga = scanner.nextDouble();

        System.out.print("Masukkan Stok: ");
        int stok = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan Jenis: ");
        String jenis = scanner.nextLine();

        System.out.print("Masukkan Bahan: ");
        String bahan = scanner.nextLine();

        System.out.print("Masukkan Warna: ");
        String warna = scanner.nextLine();

        System.out.print("Masukkan Untuk Hewan Apa (jika tidak ada, tekan -): ");
        String untuk = scanner.nextLine();

        System.out.print("Masukkan Size (jika tidak ada, tekan -): ");
        String size = scanner.nextLine();

        System.out.print("Masukkan Merk (jika tidak ada, tekan -): ");
        String merk = scanner.nextLine();

        if (untuk.equals("-") && size.equals("-") && merk.equals("-")) {
            daftarProduk.add(new Aksesoris(id, nama, harga, stok, jenis, bahan, warna));
        } else {
            daftarProduk.add(new Baju(id, nama, harga, stok, jenis, bahan, warna, untuk, size, merk));
        }

        System.out.println("Produk berhasil ditambahkan!\n");
    }

    public static void main(String[] args) {
        // Menambahkan 5 objek awal
        daftarProduk.add(new Aksesoris(1, "Kalung Anjing", 50000, 10, "Kalung", "Kulit", "Merah"));
        daftarProduk.add(new Aksesoris(2, "Gelang Kucing", 35000, 8, "Gelang", "Plastik", "Biru"));
        daftarProduk.add(new Baju(3, "Baju Anjing", 75000, 5, "Pakaian", "Katun", "Biru", "Anjing", "M", "DogStyle"));
        daftarProduk.add(new Baju(4, "Baju Kucing", 70000, 6, "Pakaian", "Wol", "Pink", "Kucing", "S", "CatFashion"));
        daftarProduk.add(new Aksesoris(5, "Topi Kucing", 25000, 12, "Topi", "Katun", "Kuning"));

        int pilihan;
        do {
            System.out.println("\nMENU UTAMA");
            System.out.println("1. Tampilkan Semua Produk");
            System.out.println("2. Tambah Produk Baru");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanSemuaProduk();
                    break;
                case 2:
                    tambahProduk();
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
    }
}