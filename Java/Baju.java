// Child dari Aksesoris
public class Baju extends Aksesoris {
    private String hewan, size, merk;

    public Baju(int id, String nama, double harga, int stok, String jenis, String bahan, String warna, String hewan, String size, String merk) {
        super(id, nama, harga, stok, jenis, bahan, warna);
        this.hewan = hewan;
        this.size = size;
        this.merk = merk;
    }

    @Override
    public void tampilkanData() {
        System.out.printf("| %-3d | %-16s | %-10.2f | %-4d | %-9s | %-7s | %-6s | %-6s | %-4s | %-10s |\n",
                id, nama, harga, stok, jenis, bahan, warna, hewan, size, merk);
    }
}