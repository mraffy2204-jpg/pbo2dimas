/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
// main.java
public class main {
    public static void main(String[] args) {

        // object constructor pertama
        kendaraan k1 = new kendaraan();
        k1.tampilData();

        System.out.println();

        // object constructor kedua
        kendaraan k2 = new kendaraan("Yamaha NMAX", "Putih", 2024, 35000000);
        k2.tampilData();

        System.out.println();

        // method dengan nilai balik
        System.out.println("Info Kendaraan : " + k2.getInfo());
    }
}