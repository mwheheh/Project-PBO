/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 */

import Model.Obat;
import Util.DbConnection;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ObatDAO {
     private Connection conn;

    public ObatDAO(Connection conn) {
        this.conn = conn;
    }
     public void insert(Obat obat) {
        String sql = "INSERT INTO obat (nama_obat, stok, harga) VALUES (?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, obat.getNamaObat());
            ps.setInt(2, obat.getStok());
            ps.setDouble(3, obat.getHarga());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Obat> getAll() {
        List<Obat> list = new ArrayList<>();
        String sql = "SELECT * FROM obat";

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Obat o = new Obat();
                o.setId(rs.getInt("id"));
                o.setNamaObat(rs.getString("nama_obat"));
                o.setStok(rs.getInt("stok"));
                o.setHarga(rs.getDouble("harga"));
                list.add(o);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
    public int getIdByNama(String nama) {
    int id = -1;
    String sql = "SELECT id FROM obat WHERE nama_obat = ?";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, nama);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            id = rs.getInt("id");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return id;
}
public void update(Obat obat) {
    String sql = "UPDATE obat SET stok = ?, harga = ? WHERE id = ?";
    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, obat.getStok());
        stmt.setDouble(2, obat.getHarga());
        stmt.setInt(3, obat.getId()); // pastikan ada id

        stmt.executeUpdate();        JOptionPane.showMessageDialog(null, "Data berhasil diperbarui!");
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Gagal memperbarui data!");
    }
}

}
