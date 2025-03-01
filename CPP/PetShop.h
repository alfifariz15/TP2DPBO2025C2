#include <iostream>
#include <iomanip>  // Untuk format tabel
using namespace std;

class PetShop {
        private:
            int id;
            string nama_produk;
            double harga_produk;
            int stok_produk;

        public:
            PetShop() {
                
            }

    PetShop(int id, string nama, double harga, int stok) {
        this->id = id;
        this->nama_produk = nama;
        this->harga_produk = harga;
        this->stok_produk = stok;
    }

    virtual void tampilkanData() {
        cout << setw(5) << id << setw(20) << nama_produk 
        << setw(12) << harga_produk << setw(8) << stok_produk;
    }
};