public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){
        setjmlsisi(1);
    }

    public Lingkaran(double diameter, String warna, String border){
        super(1,warna,border);
        this.jari = diameter/2;
    }

    public double getjari(){
        return jari;
    }

    public void setjari(double jari){
        this.jari = jari;
    }

    public double getluas(){
        return Math.PI * jari * jari;
    }

    public double getkeliling(){
        return 2 * Math.PI * jari;
    }
}
