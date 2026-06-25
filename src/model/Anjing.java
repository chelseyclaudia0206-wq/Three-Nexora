/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Anjing extends Hewan {
    private String ras;

    public Anjing() {
    }

    public Anjing(int idHewan, String namaHewan, String jenisHewan, int umur, String catatan, String ras) {
        super(idHewan, namaHewan, jenisHewan, umur, catatan);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ras Anjing: " + ras);
    }
}
