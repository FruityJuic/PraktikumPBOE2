package pbo12_24060124130061;

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {

    @Override
    public void savePerson(Person person) throws Exception {

        String name = person.getName();

        String url = "jdbc:mysql://localhost:3306/pbo";

        Connection con = DriverManager.getConnection(url, “USERNAME_DB_KAMU”, “PASSWORD_KAMU”); 

        String query = "INSERT INTO person(name) VALUES('" + name + "')";

        Statement s = con.createStatement();

        s.executeUpdate(query);

        System.out.println("Berhasil insert!");

        s.close();
        con.close();
    }
}