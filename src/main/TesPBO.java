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
        Hewan h1 = new Kucing(1, "Milo", "Kucing", 2, "Tidak suka makanan basah", "Putih");
        Hewan h2 = new Anjing(2, "Buddy", "Anjing", 3, "Aktif dan suka jalan", "Golden Retriever");
        Hewan h3 = new Kelinci(3, "Bunny", "Kelinci", 1, "Suka wortel", "Wortel dan sayuran");

        h1.tampilkanInfo();
        System.out.println("-------------------");

        h2.tampilkanInfo();
        System.out.println("-------------------");

        h3.tampilkanInfo();
        System.out.println("-------------------");

        Reservasi r1 = new Reservasi(1, 1, "2026-06-13", "2026-06-16", 3);
        System.out.println("Total Biaya: Rp" + r1.getTotalBiaya());

        System.out.println("-------------------");

        if (h3 instanceof Kelinci) {
            Kelinci kelinci = (Kelinci) h3;
            System.out.println("Hewan ini adalah kelinci dengan makanan favorit: " + kelinci.getJenisMakanan());
        }
    }
}
