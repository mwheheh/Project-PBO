/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Pasien {
    private int id;
    private String nama;
    private Date tanggalLahir;
    private String jenisKelamin;
    private String alamat;
    private String noTelepon;
    private String email;
    
    public Pasien() {}

    public Pasien(String nama, Date tanggalLahir, String jenisKelamin, String alamat, String noTelepon, String email) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.email = email;
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public Date getTanggalLahir() { return tanggalLahir; }
    public void setTanggalLahir(Date tanggalLahir) { this.tanggalLahir = tanggalLahir; }

    public String getJenisKelamin() { return jenisKelamin; }
    public void setJenisKelamin(String jenisKelamin) { this.jenisKelamin = jenisKelamin; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getNoTelepon() { return noTelepon; }
    public void setNoTelepon(String noTelepon) { this.noTelepon = noTelepon; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

//    @Override
//    public String toString() {
//        return "Pasien{" +
//                "id=" + id +
//                ", nama='" + nama + '\'' +
//                ", tanggalLahir=" + tanggalLahir +
//                ", jenisKelamin='" + jenisKelamin + '\'' +
//                ", alamat='" + alamat + '\'' +
//                ", noTelepon='" + noTelepon + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
}