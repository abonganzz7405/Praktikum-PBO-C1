/* Nama File : Anjing.java
 * Deskripsi : Kelas Anjing yang merupakan turunan dari kelas abstrak Anabul
 * Pembuat   : Syahreza Abror Alvarizqi // 24060123140053
 * Tanggal   : 04/05/2025
 */

package TugasPraktikum;

public class Anjing extends Anabul {

    // Constructor dengan parameter nama anjing
    public Anjing(String Nama) {
        super(Nama);
    }

    // Implementasi method Gerak untuk anjing
    @Override
    public void Gerak() {
        System.out.println(super.getNama() + " Bergerak dengan cara melata.");
    }

    // Implementasi method Bersuara untuk anjing
    @Override
    public void Bersuara() {
        System.out.println(super.getNama() + " Mengeluarkan suara Guk-guk...");
    }

    // Implementasi method PerilakuKhas untuk anjing
    @Override
    public void PerilakuKhas() {
        System.out.println(super.getNama() + " Mengejar ekornya");
    }
}