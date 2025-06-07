/**
 * File      : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; // Akan menyebabkan ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException exception) {
            // Menangani kesalahan saat indeks array di luar batas
            exception.printStackTrace();
        } finally {
            // Blok ini akan selalu dijalankan, baik ada exception maupun tidak
            System.out.println("clean up code...");
        }
    }
}
