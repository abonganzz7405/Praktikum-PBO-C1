package AKADEMIK;

public class Kendaraan {
    private String nomorPlat;
    private String Jenis;
    
    //konstruktor
    public Kendaraan(String nomorPlat, String Jenis){
        this.nomorPlat = nomorPlat;
        this.Jenis = Jenis;
    }

    //getter dan setter
    public String getNomorPlat(){
        return nomorPlat;
    }

    public void setNomorPlat(String nomorPlat){
        this.nomorPlat = nomorPlat;
    }

    public String getJenis(){
        return Jenis;
    }

    public void setJenis(String Jenis){
        this.Jenis = Jenis;
    }

    //method
    public void printKendaraan(){
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Jenis: " + Jenis);
    }

    public static void main(String[] args){
        Kendaraan k1 = new Kendaraan("B 4285 TPU", "Motor");
        k1.printKendaraan();
    }
}
