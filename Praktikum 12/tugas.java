import java.util.HashMap;
import java.util.Map;

public class tugas {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060120", "Syahreza");
        mahasiswaMap.put("24060121", "Abror");
        mahasiswaMap.put("24060122", "Alva");
        mahasiswaMap.put("24060123", "Rizqi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}