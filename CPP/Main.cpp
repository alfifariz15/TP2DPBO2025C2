#include <iostream>
#include <vector>
#include <iomanip>  // Untuk setw()
#include <string> 
#include "Baju.h"

using namespace std;

// List penyimpanan data produk
vector<PetShop*> daftarProduk;

// Fungsi untuk menampilkan tabel data
void tampilkanSemuaProduk() {
    cout << "===================================================================================================================" << endl;
    cout << "| " << setw(5) << left << "ID"
         << "| " << setw(20) << left << "Nama Produk"
         << "| " << setw(10) << left << "Harga"
         << "| " << setw(6) << left << "Stok"
         << "| " << setw(12) << left << "Jenis"
         << "| " << setw(12) << left << "Bahan"
         << "| " << setw(8) << left << "Warna"
         << "| " << setw(8) << left << "Hewan"
         << "| " << setw(5) << left << "Size"
         << "| " << setw(10) << left << "Merk"
         << " |" << endl;
    cout << "===================================================================================================================" << endl;

    for (PetShop* produk : daftarProduk) {
        produk->tampilkanData();
    }
    
    cout << "===================================================================================================================" << endl;
}

// Fungsi untuk menambahkan produk baru dari user
void tambahProduk() {
    int id, stok;
    double harga;
    string nama, jenis, bahan, warna, hewan, size, merk;
    
    cout << "\nTambah Produk Baru" << endl;
    cout << "Masukkan ID: "; cin >> id;
    cin.ignore();
    cout << "Masukkan Nama Produk: "; getline(cin, nama);
    cout << "Masukkan Harga: "; cin >> harga;
    cout << "Masukkan Stok: "; cin >> stok;
    cin.ignore();
    cout << "Masukkan Jenis: "; getline(cin, jenis);
    cout << "Masukkan Bahan: "; getline(cin, bahan);
    cout << "Masukkan Warna: "; getline(cin, warna);
    cout << "Masukkan Untuk hewan apa: "; getline(cin, hewan);
    cout << "Masukkan Size: "; getline(cin, size);
    cout << "Masukkan Merk: "; getline(cin, merk);

    // Menambahkan ke daftarProduk
    daftarProduk.push_back(new Baju(id, nama, harga, stok, jenis, bahan, warna, hewan, size, merk));

    cout << "\n Produk berhasil ditambahkan!\n";
}

int main() {
    // Menambahkan 5 objek awal
    daftarProduk.push_back(new Aksesoris(1, "Kalung Anjing", 50000, 10, "Kalung", "Kulit", "Merah"));
    daftarProduk.push_back(new Aksesoris(2, "Gelang Kucing", 35000, 8, "Gelang", "Plastik", "Biru"));
    daftarProduk.push_back(new Baju(3, "Baju Anjing", 75000, 5, "Pakaian", "Katun", "Biru", "Anjing", "M", "DogStyle"));
    daftarProduk.push_back(new Baju(4, "Baju Kucing", 70000, 6, "Pakaian", "Wol", "Pink", "Kucing", "S", "CatFashion"));
    daftarProduk.push_back(new Aksesoris(5, "Topi Kucing", 25000, 12, "Topi", "Katun", "Kuning"));

    int pilihan;
    do {
        cout << "\nMENU UTAMA\n";
        cout << "1. Tampilkan Semua Produk\n";
        cout << "2. Tambah Produk Baru\n";
        cout << "3. Keluar\n";
        cout << "Pilihan: ";
        cin >> pilihan;

        switch (pilihan) {
            case 1:
                tampilkanSemuaProduk();
                break;
            case 2:
                tambahProduk();
                break;
            case 3:
                cout << "\nKeluar dari program.\n";
                break;
            default:
                cout << "\nPilihan tidak valid! Silakan coba lagi.\n";
        }
    } while (pilihan != 3);

    return 0;
}
