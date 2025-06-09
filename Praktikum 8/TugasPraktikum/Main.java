/* Nama File : Main.java
 * Deskripsi : Main Program untuk mendemonstrasikan Polimorfisme pada kelas Anabul
 * Pembuat   : Syahreza Abror Alvarizqi // 24060123140053
 * Tanggal   : 04/05/2025
 */

 package TugasPraktikum;

public class Main {
    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan Anabul
        Anjing anjing = new Anjing("Maxxy");
        Kucing kucing = new Kucing("Garfield");
        Burung burung = new Burung("Meraki");

        // Memanggil method Gerak dan Bersuara untuk anjing
        anjing.Gerak();
        anjing.Bersuara();

        // Memanggil method Gerak dan Bersuara untuk kucing
        kucing.Gerak();
        kucing.Bersuara();

        // Memanggil method Gerak dan Bersuara untuk burung
        burung.Gerak();
        burung.Bersuara();
    }
}