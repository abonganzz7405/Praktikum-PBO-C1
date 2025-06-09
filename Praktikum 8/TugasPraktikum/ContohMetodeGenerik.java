/* Nama File : ContohMetodeGenerik.java
 * Deskripsi : Kelas yang berisi contoh metode generik
 * Pembuat   : Syahreza Abror Alvarizqi // 24060123140053
 * Tanggal   : 04/05/2025
 */

 package TugasPraktikum;

// Kelas yang mendemonstrasikan penggunaan metode-metode generik
public class ContohMetodeGenerik {
    // Metode generik yang mengembalikan objek bertipe parameter G
    <G> G isiDatum(Datum<G> datum) {
        return datum.getIsi();
    }

    // Metode generik dengan parameter tipe G dibatasi untuk turunan Anabul
    <G extends Anabul> void TampilkanGerakdanSuara(Datum<G> datum) {
        datum.getIsi().Gerak();
        datum.getIsi().Bersuara();
    }

    // Metode generik untuk menampilkan perilaku khas dari hewan
    <G extends Anabul> void TampilkanPerilakuKhas(Datum<G> datum) {
        System.out.println("Perilaku khas dari " + datum.getIsi().getNama() + ":");
        datum.getIsi().PerilakuKhas();
    }
}