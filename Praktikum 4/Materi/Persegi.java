public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(){
        setjmlsisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4,warna,border);
        this.sisi = sisi;
    }

    public double getsisi(){
        return sisi;
    }

    public void setsisi(double sisi){
        this.sisi = sisi;
    }

    public double getluas(){
        return sisi * sisi;
    }

    public double getkeliling(){
        return 4 * sisi;
    }

    public double getdiagonal(){
        return Math.sqrt(2) * sisi;
    }

    public void printinfo(){
        super.printinfo();
        System.out.println("Sisi : "+ sisi);
    }
}
