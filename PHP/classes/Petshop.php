<?php
class Petshop {
    protected $id, $nama_produk, $harga_produk, $stok_produk, $foto_produk;

    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk) {
        $this->id = $id;
        $this->nama_produk = $nama_produk;
        $this->harga_produk = $harga_produk;
        $this->stok_produk = $stok_produk;
        $this->foto_produk = $foto_produk;
    }

    public function tampilkanData() {
        echo "<tr>
                <td>{$this->id}</td>
                <td><img src='uploads/{$this->foto_produk}' width='50'></td>
                <td>{$this->nama_produk}</td>
                <td>{$this->harga_produk}</td>
                <td>{$this->stok_produk}</td>";
    }
}
?>