public class BangunDatar {
    private int jmlsisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }
    
    public BangunDatar(int jmlsisi, String warna, String border){
        this.jmlsisi = jmlsisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printcounterBangunDatar(){
        System.out.println("Jumlah objek Bangun Datar : "+ counterBangunDatar);
    }

    public int getjmlsisi(){
        return jmlsisi;
    }

    public void setjmlsisi(int jmlsisi){
        this.jmlsisi = jmlsisi;
    }

    public String getwarna(){
        return warna;
    }

    public void setwarna(String warna){
        this.warna = warna;
    }

    public String getborder(){
        return border;
    }

    public void setborder(String border){
        this.border = border;
    }

    public void printinfo(){
        System.out.println("Jumlah Sisi : "+ jmlsisi);
        System.out.println("Warna : "+ warna);
        System.out.println("Border : "+ border);            
    }
}
