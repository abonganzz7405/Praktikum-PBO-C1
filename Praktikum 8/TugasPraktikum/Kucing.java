/* Nama File : Kucing.java
 * Deskripsi : Kelas Kucing yang merupakan turunan dari kelas abstrak Anabul
 * Pembuat   : Syahreza Abror Alvarizqi // 24060123140053
 * Tanggal   : 04/05/2025
 */

 package TugasPraktikum;

public class Kucing extends Anabul {

    // Constructor dengan parameter nama kucing
    public Kucing(String Nama) {
        super(Nama);
    }

    // Implementasi method Gerak untuk kucing
    @Override
    public void Gerak() {
        System.out.println(super.getNama() + " Bergerak dengan cara melata.");
    }

    // Implementasi method Bersuara untuk kucing
    @Override
    public void Bersuara() {
        System.out.println(super.getNama() + " Mengeluarkan suara Meoong...");
    }

    // Implementasi method PerilakuKhas untuk kucing
    @Override
    public void PerilakuKhas() {
        System.out.println(super.getNama() + " Menangkap tikus");
    }
}