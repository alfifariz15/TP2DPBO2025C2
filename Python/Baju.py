from Aksesoris import Aksesoris

class Baju(Aksesoris):
    def __init__(self, id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna, hewan, size, merk):
        super().__init__(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna)
        self.hewan = hewan
        self.size = size
        self.merk = merk