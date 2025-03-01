from PetShop import PetShop
from Aksesoris import Aksesoris
from Baju import Baju

# Fungsi menampilkan data dalam bentuk tabel
def display_data(data_list):
    print("=" * 120)
    print("{:<5} {:<20} {:<10} {:<10} {:<10} {:<10} {:<10} {:<10} {:<10} {:<10}".format(
        "ID", "Nama Produk", "Harga", "Stok", "Jenis", "Bahan", "Warna", "Hewan", "Size", "Merk"))
    print("=" * 120)
    for data in data_list:
        if isinstance(data, Baju):
            print("{:<5} {:<20} {:<10} {:<10} {:<10} {:<10} {:<10} {:<10} {:<10} {:<10}".format(
                data.id, data.nama_produk, data.harga_produk, data.stok_produk, data.jenis, data.bahan, data.warna, data.hewan, data.size, data.merk))
        elif isinstance(data, Aksesoris):
            print("{:<5} {:<20} {:<10} {:<10} {:<10} {:<10} {:<10}".format(
                data.id, data.nama_produk, data.harga_produk, data.stok_produk, data.jenis, data.bahan, data.warna))
        elif isinstance(data, PetShop):
            print("{:<5} {:<20} {:<10} {:<10}".format(
                data.id, data.nama_produk, data.harga_produk, data.stok_produk))
    print("=" * 120)

# Data awal
data_list = [
    PetShop(1, "Makanan Kucing", 50000, 100),
    Aksesoris(2, "Kalung Anjing", 150000, 50, "Kalung", "Stainless Steel", "Silver"),
    Baju(3, "Baju Anjing", 200000, 30, "Baju", "Katun", "Merah", "Anjing", "L", "PetStyle"),
    PetShop(4, "Mainan Kucing", 75000, 80),
    Aksesoris(5, "Tali Anjing", 100000, 60, "Tali", "Nilon", "Hitam")
]

# Fungsi untuk menambahkan produk baru dari user
def input_data():
    print("\nTambah Produk Baru:")
    id = int(input("Masukkan ID: "))
    nama_produk = input("Masukkan Nama Produk: ")
    harga_produk = int(input("Masukkan Harga Produk: "))
    stok_produk = int(input("Masukkan Stok Produk: "))
    jenis = input("Masukkan Jenis: ")
    bahan = input("Masukkan Bahan: ")
    warna = input("Masukkan Warna: ")
    hewan = input("Masukkan Untuk Hewan Apa: ")
    size = input("Masukkan Size: ")
    merk = input("Masukkan Merk: ")

    produk_baru = Baju(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, hewan, size, merk)
    data_list.append(produk_baru)
    print("\n✅ Produk berhasil ditambahkan!")

# Menu utama
while True:
    print("\nMENU UTAMA")
    print("1. Tampilkan Semua Produk")
    print("2. Tambah Produk Baru")
    print("3. Keluar")
    pilihan = input("Pilihan: ")

    if pilihan == "1":
        display_data(data_list)
    elif pilihan == "2":
        input_data()
    elif pilihan == "3":
        print("Keluar dari program. 👋")
        break
    else:
        print("❌ Pilihan tidak valid! Silakan coba lagi.")
