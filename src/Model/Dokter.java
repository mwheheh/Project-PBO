/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Dokter {
     private int id;
    private String nama;
    private String tanggalLahir;
    private String spesialisasi;
    private String noTelepon;

    // Constructor
    public Dokter() {}

    public Dokter(int id, String nama, String tanggalLahir, String spesialisasi, String noTelepon) {
        this.id = id;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.spesialisasi = spesialisasi;
        this.noTelepon = noTelepon;
    }

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getTanggalLahir() { return tanggalLahir; }
    public void setTanggalLahir(String tanggalLahir) { this.tanggalLahir = tanggalLahir; }

    public String getSpesialisasi() { return spesialisasi; }
    public void setSpesialisasi(String spesialisasi) { this.spesialisasi = spesialisasi; }

    public String getNoTelepon() { return noTelepon; }
    public void setNoTelepon(String noTelepon) { this.noTelepon = noTelepon; }
}

