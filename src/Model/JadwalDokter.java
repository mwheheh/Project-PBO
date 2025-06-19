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
public class JadwalDokter {
    private int id;
    private String dokter;
    private String hari;
    private String jamMulai;
    private String jamSelesai;
    
    public JadwalDokter(){}

    public JadwalDokter(int id, String dokter, String hari, String jamMulai, String jamSelesai) {
        this.id = id;
        this.dokter = dokter;
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
    }

    public int getId() { return id; }
    public String getDokter() { return dokter; }
    public String getHari() { return hari; }
    public String getJamMulai() { return jamMulai; }
    public String getJamSelesai() { return jamSelesai; }

    public void setId(int id) { this.id = id; }
    public void setDokter(String dokter) { this.dokter = dokter; }
    public void setHari(String hari) { this.hari = hari; }
    public void setJamMulai(String jamMulai) { this.jamMulai = jamMulai; }
    public void setJamSelesai(String jamSelesai) { this.jamSelesai = jamSelesai; }
}

