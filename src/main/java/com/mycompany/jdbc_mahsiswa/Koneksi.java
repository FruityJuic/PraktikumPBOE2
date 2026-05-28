/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdbc_mahsiswa;


import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {

    public static Connection getConnection() {

        try {

            String url =
                    "jdbc:mysql://localhost:3306/kampus";

            String user = "root";
            String pass = "";

            Connection conn =
                    DriverManager.getConnection(
                            url,
                            user,
                            pass
                    );

            System.out.println("Koneksi berhasil");

            return conn;

        } catch(Exception e) {

            System.out.println("Koneksi gagal");
            System.out.println(e);

            return null;
        }
    }
}