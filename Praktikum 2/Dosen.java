package AKADEMIK;

public class Dosen {
    //atribut
    private String nip;
    private String nama;
    private String prodi;
    
    //konstruktor
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //getter dan setter
    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    //method
    public void printDosen(){
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public static void main(String[] args){
        Dosen d1 = new Dosen("24060123140053", "abong ganteng", "Informatika");
        d1.printDosen();
    }

}
