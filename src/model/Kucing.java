/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Kucing extends Hewan {
     private String kebutuhanPerawatan;

    public Kucing() {
        super();
    }

    public Kucing(int idHewan, String namaHewan, String jenisHewan, int umur, String kebutuhanPerawatan) {
        super(idHewan, namaHewan, jenisHewan, umur, kebutuhanPerawatan);
        this.kebutuhanPerawatan = kebutuhanPerawatan;
    }

    public String getKebutuhanPerawatan() {
        return kebutuhanPerawatan;
    }

    public void setKebutuhanPerawatan(String kebutuhanPerawatan) {
        this.kebutuhanPerawatan = kebutuhanPerawatan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kebutuhan Perawatan: " + kebutuhanPerawatan);
    }
}
