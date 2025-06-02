package AKADEMIK;

import java.util.ArrayList;

public class Mahasiswa {
    //atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> ListMatkul;
    private Dosen DosenWali;
    private Kendaraan Kendaraan;

    //konstruktor

    public Mahasiswa(String nim, String nama, String prodi, Dosen DosenWali, Kendaraan Kendaraan){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.DosenWali = DosenWali;
        this.Kendaraan = Kendaraan;
        ListMatkul = new ArrayList<MataKuliah>();
    }

    //getter dan setter

    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
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

    public Dosen getDosenWali(){
        return DosenWali;
    }

    public void setDosenWali(Dosen DosenWali){
        this.DosenWali = DosenWali;
    }

    public Kendaraan getKendaraan(){
        return Kendaraan;
    }

    public void setKendaraan(Kendaraan Kendaraan){
        this.Kendaraan = Kendaraan;
    }

    //method

    public void printMahasiswa(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen Wali: ");
        DosenWali.printDosen();
        System.out.println("Kendaraan: ");
        Kendaraan.printKendaraan();
        System.out.println("Mata Kuliah: ");
        for(MataKuliah m : ListMatkul){
            m.printMataKuliah();
        }
    }

    public static void main(String[] args){
        Mahasiswa d1 = new Mahasiswa("24060123140053", "abong ganteng", "Informatika", "Pak APW", "B 4285 TPU");
        d1.printMahasiswa();
    }

}
