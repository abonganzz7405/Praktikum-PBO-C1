package AKADEMIK;

public class MataKuliah {
    //atribut
    private String IdMatkul;
    private String Nama;
    private int sks;

    //konstruktor
    public MataKuliah(String IdMatkul, String Nama, int sks){
        this.IdMatkul = IdMatkul;
        this.Nama = Nama;
        this.sks = sks;
    }

    //getter dan setter

    public String getIdMatkul(){
        return IdMatkul;
    }

    public void setIdMatkul(String IdMatkul){
        this.IdMatkul = IdMatkul;
    }

    public String getNama(){
        return Nama;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public int getSks(){
        return sks;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    //method

    public void printMataKuliah(){
        System.out.println("ID Mata Kuliah: " + IdMatkul);
        System.out.println("Nama Mata Kuliah: " + Nama);
        System.out.println("SKS: " + sks);
    }

    public static void main(String[] args){
        MataKuliah m1 = new MataKuliah("IF1234", "Pemrograman Berorientasi Objek", 3);
        m1.printMataKuliah();
    }
}
