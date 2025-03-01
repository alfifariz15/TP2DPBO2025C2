// Kelas Induk
public class Petshop {
    protected int id, stok;
    protected String nama;
    protected double harga;

    public Petshop(int id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanData() {
        System.out.printf("| %-3d | %-16s | %-10.2f | %-4d | %-9s | %-7s | %-6s | %-6s | %-4s | %-10s |\n",
                          id, nama, harga, stok, "-", "-", "-", "-", "-", "-");
    }
}