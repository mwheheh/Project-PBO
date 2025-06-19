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
import Model.JadwalDokter;
import Util.DbConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JadwalDokterDAO {

    public List<JadwalDokter> getAll() {
        List<JadwalDokter> list = new ArrayList<>();
        String sql = "SELECT * FROM jadwal_dokter";

        try (Connection conn = DbConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                JadwalDokter jadwal = new JadwalDokter();
                jadwal.setId(rs.getInt("id"));
                jadwal.setDokter(rs.getString("dokter"));
                jadwal.setHari(rs.getString("hari"));
                jadwal.setJamMulai(rs.getString("jam_mulai"));
                jadwal.setJamSelesai(rs.getString("jam_selesai"));
                list.add(jadwal);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

