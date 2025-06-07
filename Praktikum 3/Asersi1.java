/**
 * File      : Asersi1.java
 * Deskripsi : Program untuk menunjukkan penggunaan asersi
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;

        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            // Menggunakan asersi untuk memastikan bahwa x tidak kurang dari 0
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}