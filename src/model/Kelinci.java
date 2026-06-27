/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Kelinci extends Hewan {
    private String jenisMakanan;

    public Kelinci() {
    }

    public Kelinci(int idHewan, String namaHewan, String jenisHewan, int umur, String catatan, String jenisMakanan) {
        super(idHewan, namaHewan, jenisHewan, umur, catatan);
        this.jenisMakanan = jenisMakanan;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kebutuhan Perawatan: Membersihkan kandang dan memberi pakan sayuran.");
    }
}