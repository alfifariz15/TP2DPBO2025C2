# TP2DPBO2025C2
Saya Muhammad Alfi Fariz dengan NIM 2311174 mengerjakan TP 2 dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Design Diagram
![DPBO TP2 drawio](https://github.com/user-attachments/assets/be66af8c-8dd8-4e47-85cb-1084a1f02902)

- Baju adalah turunan dari Aksesoris, dan Aksesoris adalah turunan dari PetShop (Multi-Level Inheritance).
- Hierarki class ini membantu memodelkan sistem manajemen produk PetShop dengan baik.
- Hubungan antara class menggunakan konsep pewarisan (extends) untuk mempermudah kode yang lebih reusable.

# Penjelasan Atribut dan Method
Penjelasan Atribut dan Methods
Class PetShop:
- id: ID produk.
- nama_produk: Nama produk.
- harga_produk: Harga produk.
- stok_produk: Stok produk.
- foto_produk: Foto produk.

Class Aksesoris (Child dari PetShop):
- jenis: Jenis aksesoris.
- bahan: Bahan aksesoris.
- warna: Warna aksesoris.

Class Baju (Child dari Aksesoris):
- hewan: Untuk siapa baju tersebut (misal: anjing, kucing).
- size: Ukuran baju.
- merk: Merk baju.

Tabel Dinamis
- dan untuk buat tabel dinamis kalo di bahasa CPP pake setw dari library #include <iomanip>, kalo python pake format, kalo java pake printf dan println

Penjelasan untuk bahasa Python
- PetShop adalah superclass yang menyimpan atribut dasar produk seperti id, nama_produk, harga_produk, dan stok_produk.
Semua produk, termasuk Aksesoris dan Baju, akan mewarisi atribut ini.
- Aksesoris adalah subclass dari PetShop menggunakan class Aksesoris(PetShop).
- super().__init__() digunakan untuk memanggil konstruktor PetShop dan mewarisi id, nama_produk, harga_produk, dan stok_produk.
- Menambahkan atribut baru (jenis, bahan, warna) yang hanya ada pada aksesoris.
- Baju adalah subclass dari Aksesoris menggunakan class Baju(Aksesoris).
- super().__init__() digunakan untuk memanggil konstruktor Aksesoris dan mewarisi jenis, bahan, warna, serta atribut dari PetShop.
- Menambahkan atribut baru (hewan, size, merk) yang hanya ada pada produk baju.
- Menggunakan isinstance() untuk membedakan apakah objek adalah PetShop, Aksesoris, atau Baju.
- Fungsi display_data = Menampilkan data dalam bentuk tabel yang dinamis.
- Fungsi input_data = Menerima input dari user untuk menambahkan data baru.
untuk bahasa yang lainnya seperti java, cpp, php sama kurang lebih seperti python 

# Penjelasan Alur Program
1. Program dimulai dengan inisialisasi 5 objek awal.
2. Data awal ditampilkan dalam bentuk tabel.
3. Program meminta input dari user untuk menambahkan data baru.
4. Data baru ditambahkan ke dalam list.
5. Data yang telah diperbarui ditampilkan kembali dalam bentuk tabel.
6. Kecuali bahasa PHP saya memakai hardcode tidak ada add dari user jadi hanya tabel saja
