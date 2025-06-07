/* Nama File : Coercion.java
 * Deskripsi : Program untuk mendemonstrasikan konsep coercion pada Java
 * Pembuat   : Syahreza Abror Alvarizqi // 24060123140053
 * Tanggal   : 24/04/2025
 */

public class CoercionMain {
    public static void main(String[] args) {
            int output = 'a';
            System.out.println(output);

            double x = 15.5;
            int output2 = (int)x;
            System.out.println(output2);

            int y = 25;
            double output3 = y;
            System.out.println(output3);

            int z = 78;
            char output4 = (char)z;
            System.out.println(output4);

            char a = 'a';
            double output5 = a;
            System.out.println(output5);
    }
}