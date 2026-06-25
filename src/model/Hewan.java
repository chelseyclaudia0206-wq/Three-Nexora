/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Hewan {
    private int idHewan;
    private String namaHewan;
    private String jenisHewan;
    private int umur;
    private String catatan;

    public Hewan() {
    }

    public Hewan(int idHewan, String namaHewan, String jenisHewan, int umur, String catatan) {
        this.idHewan = idHewan;
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.umur = umur;
        this.catatan = catatan;
    }

    public int getIdHewan() {
        return idHewan;
    }

    public void setIdHewan(int idHewan) {
        this.idHewan = idHewan;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + namaHewan);
        System.out.println("Jenis Hewan: " + jenisHewan);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Catatan: " + catatan);
    }
}
