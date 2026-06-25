/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Reservasi implements LayananPenitipan {
    private int idReservasi;
    private int idHewan;
    private String tanggalCheckin;
    private String tanggalCheckout;
    private int lamaHari;
    private double totalBiaya;

    public Reservasi() {
    }

    public Reservasi(int idReservasi, int idHewan, String tanggalCheckin, String tanggalCheckout, int lamaHari) {
        this.idReservasi = idReservasi;
        this.idHewan = idHewan;
        this.tanggalCheckin = tanggalCheckin;
        this.tanggalCheckout = tanggalCheckout;
        this.lamaHari = lamaHari;
        this.totalBiaya = hitungBiaya();
    }

    @Override
    public double hitungBiaya() {
        return lamaHari * LayananPenitipan.tarifPerHari();
    }

    public double hitungBiaya(int lamaHari) {
        return lamaHari * LayananPenitipan.tarifPerHari();
    }

    public double hitungBiaya(int lamaHari, double tarifKhusus) {
        return lamaHari * tarifKhusus;
    }

    public int getIdReservasi() {
        return idReservasi;
    }

    public void setIdReservasi(int idReservasi) {
        this.idReservasi = idReservasi;
    }

    public int getIdHewan() {
        return idHewan;
    }

    public void setIdHewan(int idHewan) {
        this.idHewan = idHewan;
    }

    public String getTanggalCheckin() {
        return tanggalCheckin;
    }

    public void setTanggalCheckin(String tanggalCheckin) {
        this.tanggalCheckin = tanggalCheckin;
    }

    public String getTanggalCheckout() {
        return tanggalCheckout;
    }

    public void setTanggalCheckout(String tanggalCheckout) {
        this.tanggalCheckout = tanggalCheckout;
    }

    public int getLamaHari() {
        return lamaHari;
    }

    public void setLamaHari(int lamaHari) {
        this.lamaHari = lamaHari;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public void setTotalBiaya(double totalBiaya) {
        this.totalBiaya = totalBiaya;
    }
}
