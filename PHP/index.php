<?php
require_once "classes/Petshop.php";
require_once "classes/Aksesoris.php";
require_once "classes/Baju.php";

// Data hardcoded
$produk = [
    new Aksesoris(1, "Kalung Anjing", 50000, 10, "kalung.jpeg", "Kalung", "Kulit", "Merah"),
    new Aksesoris(2, "Gelang Kucing", 35000, 8, "gelang.jpeg", "Gelang", "Plastik", "Biru"),
    new Baju(3, "Baju Anjing", 75000, 5, "baju_anjing.png", "Pakaian", "Katun", "Biru", "Anjing", "M", "DogStyle"),
    new Baju(4, "Baju Kucing", 70000, 6, "baju_kucing.jpeg", "Pakaian", "Wol", "Pink", "Kucing", "S", "CatFashion"),
    new Aksesoris(5, "Topi Kucing", 25000, 12, "topi.jpg", "Topi", "Katun", "Kuning")
];
?>

<!DOCTYPE html>
<html lang="id">
<head>
    <title>Petshop</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-4">
    <h2 class="text-center">Daftar Produk</h2>
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>Foto</th>
                <th>Nama Produk</th>
                <th>Harga</th>
                <th>Stok</th>
                <th>Jenis</th>
                <th>Bahan</th>
                <th>Warna</th>
                <th>Hewan</th>
                <th>Size</th>
                <th>Merk</th>
            </tr>
        </thead>
        <tbody>
            <?php foreach ($produk as $p) { $p->tampilkanData(); } ?>
        </tbody>
    </table>
</body>
</html>
