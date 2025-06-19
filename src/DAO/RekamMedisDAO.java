/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Lenovo
 */
import Model.Pasien;
import Model.RekamMedis;
import Util.DbConnection;

import java.sql.*;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class RekamMedisDAO {

     private Connection conn;

    public RekamMedisDAO(Connection conn) {
        this.conn = conn;
    }

    public void insert(RekamMedis rm) throws SQLException {
        String query = "INSERT INTO rekam_medis (id_pasien, waktu_kunjungan, jenis_kunjungan, diagnosis, tindakan, obat, catatan, dokter, jadwal_kontrol) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, rm.getIdPasien());
        stmt.setString(2, rm.getWaktuKunjungan());
        stmt.setString(3, rm.getJenisKunjungan());
        stmt.setString(4, rm.getDiagnosis());
        stmt.setString(5, rm.getTindakan());
        stmt.setString(6, rm.getObat());
        stmt.setString(7, rm.getCatatan());
        stmt.setString(8, rm.getDokter());
        stmt.setString(9, rm.getJadwalKontrol());

        stmt.executeUpdate();
    }
}