/**
 * Nama File : MysqlMahasiswaService.java
 * Deskripsi : Kelas untuk manipulasi table mysql melalui program java
 * Pembuat   : Syahreza Abror Alvarizqi // 24060123140053
 * Tanggal   : 03/06/2025
 */


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.model.*;
import jdbc.service.*;
import jdbc.utilities.MysqlUtility;
import static jdbc.utilities.MysqlUtility.getConnection;
/**
 *
 * @author T480s
 */
public class MysqlMahasiswaService {
      Connection koneksi = null;
    
    public MysqlMahasiswaService() {
        koneksi = getConnection();
    }
    
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

   
    public void add(String nama) throws SQLException {
        String query = "INSERT INTO mahasiswa (nama) VALUES (?)";
        try {
            PreparedStatement pst = koneksi.prepareStatement(query);
            pst.setString(1, nama);
            pst.executeUpdate();
            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    
    
    public void update(Mahasiswa mhs) throws SQLException {
      String query = "UPDATE mahasiswa SET nama = '" + mhs.getNama() + "' WHERE id = " + mhs.getId();
      try {
          Statement s = koneksi.createStatement();
          s.executeUpdate(query);
          System.out.println("berhasil update");
      } catch (SQLException e) {
          e.printStackTrace();
          throw e;
      }
    }
    
    public void delete(int id) throws SQLException {
      String query = "DELETE FROM mahasiswa WHERE id = " + id;
      try {
          Statement s = koneksi.createStatement();
          s.executeUpdate(query);
          System.out.println("berhasil delete");
      } catch (SQLException e) {
          e.printStackTrace();
          throw e;
      }
    }
    
     public Mahasiswa getById(int id) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        String query = "SELECT * FROM mahasiswa WHERE id = " + id;
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return mhs;
    }
     
     
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        if (koneksi == null) {
            System.out.println("Koneksi belum berhasil, tidak bisa load data.");
            return list;
        }

        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM mahasiswa");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                list.add(new Mahasiswa(id, nama));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }


    
    
    public void indexReset() throws SQLException{
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("berhasil reset indeks");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean isEmpty() {
        String query = "SELECT COUNT(*) FROM mahasiswa";

        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()){
                return rs.getInt(1) == 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                System.out.println("Koneksi ditutup");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    
}