/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Pasien;
import Util.DbConnection;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class PasienDAO {
    private Connection conn;

    public PasienDAO() {
        conn = DbConnection.getConnection();
    }

    public void insertPasien(Pasien p) {
        String sql = "INSERT INTO pasien (nama, tanggal_lahir, jenis_kelamin, alamat, no_telepon, email) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, p.getNama());
            stmt.setDate(2, new java.sql.Date(p.getTanggalLahir().getTime()));
            stmt.setString(3, p.getJenisKelamin());
            stmt.setString(4, p.getAlamat());
            stmt.setString(5, p.getNoTelepon());
            stmt.setString(6, p.getEmail());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Pasien> getAllPasien() {
        List<Pasien> list = new ArrayList<>();
        String sql = "SELECT * FROM pasien";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Pasien p = new Pasien();
                p.setId(rs.getInt("id"));
                p.setNama(rs.getString("nama"));
                p.setTanggalLahir(rs.getDate("tanggal_lahir"));
                p.setJenisKelamin(rs.getString("jenis_kelamin"));
                p.setAlamat(rs.getString("alamat"));
                p.setNoTelepon(rs.getString("no_telepon"));
                p.setEmail(rs.getString("email"));
                list.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Pasien getPasienById(int id) {
        String sql = "SELECT * FROM pasien WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Pasien p = new Pasien();
                p.setId(rs.getInt("id"));
                p.setNama(rs.getString("nama"));
                p.setTanggalLahir(rs.getDate("tanggal_lahir"));
                p.setJenisKelamin(rs.getString("jenis_kelamin"));
                p.setAlamat(rs.getString("alamat"));
                p.setNoTelepon(rs.getString("no_telepon"));
                p.setEmail(rs.getString("email"));
                return p;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updatePasien(Pasien pasien) {
        String sql = "UPDATE pasien SET nama=?, tanggal_lahir=?, jenis_kelamin=?, alamat=?, no_telepon=?, email=? WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pasien.getNama());
            stmt.setDate(2, new java.sql.Date(pasien.getTanggalLahir().getTime()));
            stmt.setString(3, pasien.getJenisKelamin());
            stmt.setString(4, pasien.getAlamat());
            stmt.setString(5, pasien.getNoTelepon());
            stmt.setString(6, pasien.getEmail());
            stmt.setInt(7, pasien.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

