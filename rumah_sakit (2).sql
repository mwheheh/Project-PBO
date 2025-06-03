-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 02 Jun 2025 pada 22.57
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rumah_sakit`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`username`, `password`) VALUES
('admin', 'admin123'),
('dokter', 'dokter123'),
('perawat', 'perawat123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dokter`
--

CREATE TABLE `dokter` (
  `kode_dokter` varchar(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` text DEFAULT NULL,
  `jenis_kelamin` enum('pria','wanita') NOT NULL,
  `tgl_lahir` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `dokter`
--

INSERT INTO `dokter` (`kode_dokter`, `nama`, `alamat`, `jenis_kelamin`, `tgl_lahir`) VALUES
('D001', 'Dr. Andi Wijaya', 'Jl. Merdeka No. 10', 'pria', 'Surabaya, 15 Januari 1980'),
('D002', 'Dr. Siti Rahayu', 'Jl. Sudirman No. 45', 'wanita', 'Malang, 20 Mei 1985'),
('D003', 'Dr. Budi Santoso', 'Jl. Diponegoro No. 12', 'pria', 'Sidoarjo, 10 Oktober 1978');

-- --------------------------------------------------------

--
-- Struktur dari tabel `obat`
--

CREATE TABLE `obat` (
  `kode_obat` varchar(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `stok` int(11) NOT NULL,
  `harga` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `obat`
--

INSERT INTO `obat` (`kode_obat`, `nama`, `stok`, `harga`) VALUES
('OB001', 'Paracetamol 500mg', 100, 5000.00),
('OB003', 'Vitamin C 500mg', 75, 10000.00),
('OB004', 'Omeprazole 20mg', 60, 12000.00);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasien`
--

CREATE TABLE `pasien` (
  `id_pasien` varchar(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` text DEFAULT NULL,
  `jenis_kelamin` enum('pria','wanita') NOT NULL,
  `tgl_lahir` varchar(100) DEFAULT NULL,
  `pekerjaan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pasien`
--

INSERT INTO `pasien` (`id_pasien`, `nama`, `alamat`, `jenis_kelamin`, `tgl_lahir`, `pekerjaan`) VALUES
('P001', 'Ahmad ', 'Jl. Pahlawan No. 5', 'pria', 'Surabaya, 12 Maret 1990', 'Pegawai Swasta'),
('P002', 'Dewi Lestari', 'Jl. Kenanga No. 8', 'wanita', 'Gresik, 25 Juli 1995', 'Guru'),
('P003', 'Rudi Hermawan', 'Jl. Mawar No. 15', 'pria', 'Lamongan, 5 September 1988', 'Wiraswasta');

-- --------------------------------------------------------

--
-- Struktur dari tabel `perawat`
--

CREATE TABLE `perawat` (
  `id_perawat` varchar(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` text DEFAULT NULL,
  `jenis_kelamin` enum('pria','wanita') NOT NULL,
  `tgl_lahir` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `perawat`
--

INSERT INTO `perawat` (`id_perawat`, `nama`, `alamat`, `jenis_kelamin`, `tgl_lahir`) VALUES
('N001', 'Nurul Hidayati', 'Jl. Melati No. 3', 'wanita', 'Surabaya, 10 April 1990'),
('N002', 'Eko Prasetyo', 'Jl. Anggrek No. 7', 'pria', 'Sidoarjo, 15 Mei 1987'),
('N003', 'Siti Aminah', 'Jl. Dahlia No. 12', 'wanita', 'Gresik, 20 November 1992');

-- --------------------------------------------------------

--
-- Struktur dari tabel `rekam_medis`
--

CREATE TABLE `rekam_medis` (
  `id_rekam` varchar(10) NOT NULL,
  `id_pasien` varchar(10) NOT NULL,
  `kode_dokter` varchar(10) NOT NULL,
  `diagnosa` text DEFAULT NULL,
  `tindakan` text DEFAULT NULL,
  `resep_obat` text DEFAULT NULL,
  `tgl_periksa` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `rekam_medis`
--

INSERT INTO `rekam_medis` (`id_rekam`, `id_pasien`, `kode_dokter`, `diagnosa`, `tindakan`, `resep_obat`, `tgl_periksa`) VALUES
('RM001', 'P001', 'D001', 'Demam tinggi', 'Istirahat dan minum obat', 'Paracetamol 3x1, Vitamin C 1x1', '2023-10-01'),
('RM002', 'P002', 'D002', 'Sakit tenggorokan', 'Kumur air garam', 'Amoxicillin 2x1 selama 5 hari', '2023-10-02'),
('RM003', 'P003', 'D003', 'Asam lambung', 'Hindari makanan pedas', 'Omeprazole 1x1 sebelum makan', '2023-10-03');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ruangan`
--

CREATE TABLE `ruangan` (
  `id_ruangan` varchar(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `harga` decimal(10,2) NOT NULL,
  `fasilitas` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `ruangan`
--

INSERT INTO `ruangan` (`id_ruangan`, `nama`, `harga`, `fasilitas`) VALUES
('R001', 'VIP', 500000.00, 'AC, TV, Kamar Mandi Dalam, Sofa'),
('R002', 'Kelas 1', 300000.00, 'AC, Kamar Mandi Dalam'),
('R003', 'Kelas 2', 200000.00, 'Kipas Angin, Kamar Mandi Dalam'),
('R004', 'Kelas 3', 100000.00, 'Kipas Angin, Kamar Mandi Bersama');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`kode_dokter`);

--
-- Indeks untuk tabel `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`kode_obat`);

--
-- Indeks untuk tabel `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id_pasien`);

--
-- Indeks untuk tabel `perawat`
--
ALTER TABLE `perawat`
  ADD PRIMARY KEY (`id_perawat`);

--
-- Indeks untuk tabel `rekam_medis`
--
ALTER TABLE `rekam_medis`
  ADD PRIMARY KEY (`id_rekam`),
  ADD KEY `id_pasien` (`id_pasien`),
  ADD KEY `kode_dokter` (`kode_dokter`);

--
-- Indeks untuk tabel `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`id_ruangan`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `rekam_medis`
--
ALTER TABLE `rekam_medis`
  ADD CONSTRAINT `rekam_medis_ibfk_1` FOREIGN KEY (`id_pasien`) REFERENCES `pasien` (`id_pasien`),
  ADD CONSTRAINT `rekam_medis_ibfk_2` FOREIGN KEY (`kode_dokter`) REFERENCES `dokter` (`kode_dokter`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
