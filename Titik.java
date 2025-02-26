public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik(){ //untuk mengacu ke titik yang tanpa parameter
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double x, double y){ //untuk mengacu ke titik dengan parameter yang diinput manual
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik(){
        this(0,0);
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    int getKuadran(int absis, int ordinat){
        if ( absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else if (absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(T.absis - this.absis, 2) + Math.pow(T.ordinat - this.ordinat, 2));
    }

    public Titik refleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik refleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }

    public Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }

    void printTitik(){
        System.out.println("Titik ("+ absis + "," + ordinat + ")");
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    void printcounterTitik(){
        System.out.println(Titik.counterTitik); //akan berubah menjadi "titik" bukan "this" lagi saat deklarasinya jika diperbaiki
    }

}

