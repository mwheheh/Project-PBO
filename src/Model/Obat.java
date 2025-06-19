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
public class Obat {
    private int id;
    private String namaObat;
    private int stok;
    private double harga;
    
    public Obat(){
    }

     public Obat(String namaObat, int stok, double harga) {
        this.namaObat = namaObat;
        this.stok = stok;
        this.harga = harga;
    }

    public Obat(int id, String namaObat, int stok, double harga) {
        this.id = id;
        this.namaObat = namaObat;
        this.stok = stok;
        this.harga = harga;
    }

    public int getId() { return id; }
    public String getNamaObat() { return namaObat; }
    public int getStok() { return stok; }
    public double getHarga () { return harga; }

    public void setId(int id) { this.id = id; }
    public void setNamaObat(String namaObat) { this.namaObat = namaObat; }
    public void setStok(int stok) { this.stok = stok; }
    public void setHarga (double harga){this.harga = harga;}
}

