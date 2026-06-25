/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Kucing extends Hewan {
    private String warnaBulu;

    public Kucing() {
    }

    public Kucing(int idHewan, String namaHewan, String jenisHewan, int umur, String catatan, String warnaBulu) {
        super(idHewan, namaHewan, jenisHewan, umur, catatan);
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}
