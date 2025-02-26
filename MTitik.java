public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik(); //membuat objek titik(0,0)
        Titik T2 = new Titik(2,3); //membuat objek titik(2,3)

        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        System.out.println("jumlah objek titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek titik = " + T2.getCounterTitik());
        System.out.println(getKuadran(5,10));

        Titik refleksiX = titik1.getRefleksiX();
        System.out.println("\nTitik refleksi terhadap sumbu X:");
        refleksiX.printTitik();

        Titik refleksiY = titik1.getRefleksiY();
        System.out.println("Titik refleksi terhadap sumbu Y:");
        refleksiY.printTitik();
    }
}
