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
public class Kamar {
    private int id;
    private int nomorKamar;
    private String keterangan;

    public Kamar(int nomorKamar, String keterangan) {
        this.nomorKamar = nomorKamar;
        this.keterangan = keterangan;
    }

    public Kamar(int id, int nomorKamar, String keterangan) {
        this.id = id;
        this.nomorKamar = nomorKamar;
        this.keterangan = keterangan;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getNomorKamar() { return nomorKamar; }
    public void setNomorKamar(int nomorKamar) { this.nomorKamar = nomorKamar; }

    public String getKeterangan() { return keterangan; }
    public void setKeterangan(String keterangan) { this.keterangan = keterangan; }
}


