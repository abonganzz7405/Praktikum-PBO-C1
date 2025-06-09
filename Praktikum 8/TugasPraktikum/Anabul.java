/* Nama File : Anabul.java
 * Deskripsi : Kelas abstrak Anabul yang akan diimplementasikan oleh kelas turunannya
 * Pembuat   : Syahreza Abror Alvarizqi // 24060123140053
 * Tanggal   : 04/05/2025
 */

package TugasPraktikum;

public abstract class Anabul {
    private String Nama;

    // Constructor dengan parameter nama
    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    // Method abstrak untuk definisi pergerakan anabul
    public abstract void Gerak();

    // Method abstrak untuk definisi suara anabul
    public abstract void Bersuara();

    // Method abstrak untuk perilaku spesifik masing-masing hewan
    public abstract void PerilakuKhas();

    // Getter untuk mendapatkan nama anabul
    public String getNama() {
        return Nama;
    }
}