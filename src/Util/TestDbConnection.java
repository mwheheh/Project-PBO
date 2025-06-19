/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import java.sql.SQLException;

public class TestDbConnection {
    public static void main(String[] args) {
        try (Connection conn = DbConnection.getConnection()) {
            if (conn != null) {
                System.out.println("✅ Koneksi ke database berhasil!");
            } else {
                System.out.println("❌ Koneksi gagal!");
            }
        } catch (SQLException e) {
            System.out.println("❌ Terjadi error koneksi: " + e.getMessage());
        }
    }
}

