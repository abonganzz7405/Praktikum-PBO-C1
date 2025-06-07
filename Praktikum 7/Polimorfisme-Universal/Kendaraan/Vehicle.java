package Kendaraan;

public class Vehicle {
    void calRent (int distance, float price) {
        float fare = distance * price;
        System.out.println("Vehicle price = " + fare);
    }   

    void Sewa() {
        System.out.println("Sewa Kendaraan");
    }
}
