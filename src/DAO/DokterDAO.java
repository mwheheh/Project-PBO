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
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.Dokter;
import Util.DbConnection;
import java.sql.PreparedStatement;

public class DokterDAO {

    public List<Dokter> getAllDokter() {
        List<Dokter> list = new ArrayList<>();
        String query = "SELECT * FROM dokter";
        
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Dokter dokter = new Dokter();
                dokter.setId(rs.getInt("id_dokter"));
                dokter.setNama(rs.getString("nama_dokter"));
                dokter.setTanggalLahir(rs.getString("tanggal_lahir"));
                dokter.setSpesialisasi(rs.getString("spesialisasi"));
                dokter.setNoTelepon(rs.getString("no_telepon"));
                
                list.add(dokter);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    // Tambahkan method insert, update, delete sesuai kebutuhan
}
