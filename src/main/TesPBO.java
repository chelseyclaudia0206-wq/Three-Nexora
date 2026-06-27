/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import model.Hewan;
import model.Kucing;
import model.Anjing;
import model.Kelinci;
import model.Reservasi;

public class TesPBO {

    public static void main(String[] args) {

        Hewan hewan1 = new Kucing(1, "Milo", "Kucing", 2, "Grooming bulu dan kebersihan kandang");
        Hewan hewan2 = new Anjing(2, "Buddy", "Anjing", 3, "Mandi rutin dan jalan pagi");
        Hewan hewan3 = new Kelinci(3, "Bunny", "Kelinci", 1, "Membersihkan kandang dan memberi pakan sayuran");

        Hewan[] daftarHewan = {hewan1, hewan2, hewan3};

        for (Hewan hewan : daftarHewan) {
            hewan.tampilkanInfo();

            if (hewan instanceof Kucing) {
                Kucing kucing = (Kucing) hewan;
                System.out.println("Casting berhasil: Hewan menjadi Kucing");
            } else if (hewan instanceof Anjing) {
                Anjing anjing = (Anjing) hewan;
                System.out.println("Casting berhasil: Hewan menjadi Anjing");
            } else if (hewan instanceof Kelinci) {
                Kelinci kelinci = (Kelinci) hewan;
                System.out.println("Casting berhasil: Hewan menjadi Kelinci");
            }

            System.out.println("--------------------------------");
        }

        Reservasi reservasi = new Reservasi(1, 1, "2026-06-27", "2026-06-30", 3);

        System.out.println("Biaya normal: " + reservasi.hitungBiaya());
        System.out.println("Biaya dengan lama hari tertentu: " + reservasi.hitungBiaya(5));
        System.out.println("Biaya dengan tarif khusus: " + reservasi.hitungBiaya(5, 70000));
    }
}
