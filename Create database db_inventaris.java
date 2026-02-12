CREATE DATABASE db_inventaris;


CREATE TABLE user (
id_user INT AUTO_INCREMENT PRIMARY KEY,
nama VARCHAR(100),
username VARCHAR(50),
password VARCHAR(50)
);


CREATE TABLE barang (
id_barang INT AUTO_INCREMENT PRIMARY KEY,
nama_barang VARCHAR(100),
jumlah INT
);


CREATE TABLE peminjaman (
id_pinjam INT AUTO_INCREMENT PRIMARY KEY,
id_user INT,
id_barang INT,
