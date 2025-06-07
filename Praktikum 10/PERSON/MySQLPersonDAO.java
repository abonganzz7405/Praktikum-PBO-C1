import java.sql.*;

/**
 * File     : MySQLPersonDAO.java
 * Deskripsi: Implementasi PersonDAO untuk MySQL
 */
public class MySQLPersonDAO implements PersonDAO {

    @Override
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Membuat koneksi ke database (ubah sesuai konfigurasi Anda)
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo", "root", "");

        // Menyusun dan menjalankan query SQL
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);  // Debug output query

        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);

        // Menutup koneksi database
        con.close();
    }
}
