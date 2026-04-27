/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
// kendaraan.java
public class kendaraan {

    // atribut
    String merk;
    String warna;
    int tahun;
    int harga;

    // constructor tanpa parameter
    public kendaraan() {
        merk = "Honda Vario";
        warna = "Hitam";
        tahun = 2022;
        harga = 22000000;
        System.out.println("constructor tanpa parameter jalan");
    }

    // constructor dengan parameter
    public kendaraan(String merk, String warna, int tahun, int harga) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        this.harga = harga;
        System.out.println("constructor dengan parameter jalan");
    }

    // method tanpa nilai balik
    public void tampilData() {
        System.out.println("Merk Kendaraan : " + merk);
        System.out.println("Warna          : " + warna);
        System.out.println("Tahun          : " + tahun);
        System.out.println("Harga          : Rp" + harga);
    }

    // method dengan nilai balik
    public String getInfo() {
        return merk + " | " + warna + " | " + tahun;
    }
}