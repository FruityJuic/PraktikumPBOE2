package pbo12_24060124130061;

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {

    @Override
    public void savePerson(Person person) throws Exception {

        String name = person.getName();
        String url = "jdbc:mysql://localhost:3306/pbo";
        
        // 1. REGISTRASI DRIVER SECARA MANUAL (Solusi untuk Eror "No suitable driver found")
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver MySQL tidak ditemukan di Classpath/Modulepath! Periksa kembali library NetBeans kamu.", e);
        }

        // 2. KONEKSI KE DATABASE
        Connection con = DriverManager.getConnection(
                url,
                "root",
                ""
        );

        // 3. GUNAKAN PREPAREDSTATEMENT (Lebih aman dari SQL Injection & anti-eror tanda petik)
        String query = "INSERT INTO person(name) VALUES(?)";
        PreparedStatement ps = con.prepareStatement(query);
        
        // Mengisi tanda tanya (?) pertama dengan variabel name
        ps.setString(1, name); 

        // 4. EKSEKUSI QUERY
        ps.executeUpdate();

        System.out.println("Berhasil insert!");

        // 5. TUTUP RESOURCE
        ps.close();
        con.close();
    }
}