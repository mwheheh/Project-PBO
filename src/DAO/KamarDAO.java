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

import Model.Kamar;
import Util.DbConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

public class KamarDAO {

    private Connection conn;

    public KamarDAO(Connection conn) {
        this.conn = conn;
    }

    public void insert(Kamar kamar) {
        String sql = "INSERT INTO ruangan (nomor_kamar, keterangan) VALUES (?, ?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, kamar.getNomorKamar());
            stmt.setString(2, kamar.getKeterangan());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Kamar kamar) {
        String sql = "UPDATE ruangan SET nomor_kamar = ?, keterangan = ? WHERE id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, kamar.getNomorKamar());
            stmt.setString(2, kamar.getKeterangan());
            stmt.setInt(3, kamar.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Kamar> getAll() {
        List<Kamar> list = new ArrayList<>();
        String sql = "SELECT * FROM ruangan";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Kamar kamar = new Kamar(
                    rs.getInt("id"),
                    rs.getInt("nomor_kamar"),
                    rs.getString("keterangan")
                );
                list.add(kamar);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

