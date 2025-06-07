/**
 * Nama File : Persegi.java
 * Deskripsi : implementasi Persegi sebagai BangunDatar
 * Pembuat : Syahreza Abror Alvarizqi // 24060123140053
 * Tanggal : 01/05/2025
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}