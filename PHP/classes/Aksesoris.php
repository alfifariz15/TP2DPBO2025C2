<?php
require_once "Petshop.php";

class Aksesoris extends Petshop {
    protected $jenis, $bahan, $warna;

    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna) {
        parent::__construct($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk);
        $this->jenis = $jenis;
        $this->bahan = $bahan;
        $this->warna = $warna;
    }

    public function tampilkanData() {
        parent::tampilkanData();
        echo "<td>{$this->jenis}</td>
              <td>{$this->bahan}</td>
              <td>{$this->warna}</td>
              <td>-</td><td>-</td><td>-</td></tr>";
    }
}
?>
