/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                String url = "jdbc:mysql://localhost:3306/penitipan_hewan";
                String user = "root";
                String password = "";

                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);

                System.out.println("Koneksi database berhasil!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi database gagal!");
            System.out.println("Error: " + e.getMessage());
        }

        return conn;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
