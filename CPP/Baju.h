#include "Aksesoris.h"

class Baju : public Aksesoris {
        private:
            string hewan;
            string size;
            string merk;

        public:
            Baju() {

            }

    Baju(int id, string nama, double harga, int stok, string jenis, string bahan, string warna, string hewan, string size, string merk)
        : Aksesoris(id, nama, harga, stok, jenis, bahan, warna) {
        this->hewan = hewan;
        this->size = size;
        this->merk = merk;
    }

    void tampilkanData() override
    {
        Aksesoris::tampilkanData();
        cout << setw(10) << hewan << setw(8) << size << setw(10) << merk << endl;
    }
};