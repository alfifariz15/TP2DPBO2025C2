<?php
require_once "Aksesoris.php";

class Baju extends Aksesoris {
    private $hewan, $size, $merk;

    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna, $hewan, $size, $merk) {
        parent::__construct($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna);
        $this->hewan = $hewan;
        $this->size = $size;
        $this->merk = $merk;
    }

    public function tampilkanData() {
        parent::tampilkanData();
        echo "<td>{$this->hewan}</td>
              <td>{$this->size}</td>
              <td>{$this->merk}</td></tr>";
    }
}
?>
