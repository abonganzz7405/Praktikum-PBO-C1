package Kendaraan;

public class Car extends Vehicle {
    void calRent (int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga Sewa Mobil = " + fare);
    }   

    void Sewa() {
        System.out.println("Sewa Mobil");
    }
}