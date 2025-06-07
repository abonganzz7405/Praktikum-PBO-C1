public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar Persegi = new Persegi(4, "merah", "hitam");
        BangunDatar Lingkaran = new Lingkaran(1, null, null);

        System.out.println("Sisi Persegi: " + Persegi.getjmlsisi());
        System.out.println("warna Persegi: " + Persegi.getwarna());
        System.out.println("border Persegi: " + Persegi.getborder());

        Persegi.printinfo();

        // System.out.println("Luas Lingkaran: " + Lingkaran.luas());
        // System.out.println("Keliling Lingkaran: " + Lingkaran.keliling());

        // Lingkaran.printinfo();
    }
}