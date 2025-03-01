// Child dari Petshop
class Aksesoris extends Petshop {
    protected String jenis, bahan, warna;

    public Aksesoris(int id, String namaProduk, double harga, int stok, String jenis, String bahan, String warna) {
        super(id, namaProduk, harga, stok);
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }

    @Override
    public void tampilkanData() {
        System.out.printf("| %-3d | %-16s | %-10.2f | %-4d | %-9s | %-7s | %-6s | %-6s | %-4s | %-10s |\n",
                id, nama, harga, stok, jenis, bahan, warna, "-", "-", "-");
    }
}
