/* Nama File : Student.java
 * Deskripsi : Kelas turunan Student untuk mendemonstrasikan Polimorfisme Universal (Inclusion) pada Java
 * Pembuat   : Syahreza Abror Alvarizqi // 24060123140053
 * Tanggal   : 26/04/2025
 */
package Manusia;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public boolean isAsleep(int hr) {
        return hr > 2 && hr < 8;
    }
} 