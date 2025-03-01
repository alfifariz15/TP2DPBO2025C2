#include "PetShop.h"

class Aksesoris : public PetShop {
        private:
            string jenis;
            string bahan;
            string warna;

        public:
            Aksesoris() {
                
            }

    Aksesoris(int id, string nama, double harga, int stok, string jenis, string bahan, string warna) 
        : PetShop(id, nama, harga, stok) {
        this->jenis = jenis;
        this->bahan = bahan;
        this->warna = warna;
    }

    void tampilkanData() override {
        PetShop::tampilkanData();
        cout << setw(15) << jenis << setw(15) << bahan << setw(10) << warna << endl;
    }
};