/**
 * Nama File : Lingkaran.java
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 * Pembuat : Syahreza Abror Alvarizqi // 24060123140053
 * Tanggal : 01/05/2025
 */

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }

    @Override
    public double hitungLuas() {
        return 3.14 * jejari * jejari;
    }
}