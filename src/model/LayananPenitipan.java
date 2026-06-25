/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public interface LayananPenitipan {
    
    // method abstrak
    double hitungBiaya();
    
    // method static
    static double tarifPerHari() {
        return 50000;
    }
    
    // method default
    default void infoLayanan() {
        System.out.println("Layanan penitipan hewan menyediakan reservasi dan perawatan harian.");
    }
}
