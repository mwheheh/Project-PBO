/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Timestamp;
import java.util.Date;
import Model.Pasien;

/**
 *
 * @author Lenovo
 */
public class RekamMedis {
    
    public RekamMedis(Pasien pasien) {
}
    
    private int idPasien;
    private String waktuKunjungan;
    private String jenisKunjungan;
    private String diagnosis;
    private String tindakan;
    private String obat;
    private String catatan;
    private String dokter;
    private String jadwalKontrol;

    // Setter dan Getter
    public int getIdPasien() { return idPasien; }
    public void setIdPasien(int idPasien) { this.idPasien = idPasien; }

    public String getWaktuKunjungan() { return waktuKunjungan; }
    public void setWaktuKunjungan(String waktuKunjungan) { this.waktuKunjungan = waktuKunjungan; }

    public String getJenisKunjungan() { return jenisKunjungan; }
    public void setJenisKunjungan(String jenisKunjungan) { this.jenisKunjungan = jenisKunjungan; }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public String getTindakan() { return tindakan; }
    public void setTindakan(String tindakan) { this.tindakan = tindakan; }

    public String getObat() { return obat; }
    public void setObat(String obat) { this.obat = obat; }

    public String getCatatan() { return catatan; }
    public void setCatatan(String catatan) { this.catatan = catatan; }

    public String getDokter() { return dokter; }
    public void setDokter(String dokter) { this.dokter = dokter; }

    public String getJadwalKontrol() { return jadwalKontrol; }
    public void setJadwalKontrol(String jadwalKontrol) { this.jadwalKontrol = jadwalKontrol; }
}