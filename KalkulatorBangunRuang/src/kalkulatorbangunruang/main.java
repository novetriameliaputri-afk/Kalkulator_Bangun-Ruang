/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KalkulatorBangunRuang;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===========  ===========================");
        System.out.println("       KALKULATOR BANGUN RUANG");
        System.out.println("======================================");

        // OBJEK 1: KUBUS
        System.out.println("\n======================================");
        System.out.println("             HITUNG KUBUS");
        System.out.println("======================================");

        System.out.print("Masukkan sisi kubus (cm): ");
        double sisi = input.nextDouble();

        Kubus kubus = new Kubus(sisi);

        System.out.println("Volume Kubus = "
                + kubus.hitungVolume() + " cm3");

        System.out.println("Luas Permukaan Kubus = "
                + kubus.hitungLuasPermukaan() + " cm2");


        // OBJEK 2: BALOK
        System.out.println("\n======================================");
        System.out.println("             HITUNG BALOK");
        System.out.println("======================================");

        System.out.print("Masukkan panjang (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = input.nextDouble();

        Balok balok = new Balok(panjang, lebar, tinggi);

        System.out.println("Volume Balok = "
                + balok.hitungVolume() + " cm3");

        System.out.println("Luas Permukaan Balok = "
                + balok.hitungLuasPermukaan() + " cm2");


        // OBJEK 3: TABUNG
        System.out.println("\n======================================");
        System.out.println("             HITUNG TABUNG");
        System.out.println("======================================");

        System.out.print("Masukkan jari-jari (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi (cm): ");
        double t = input.nextDouble();

        Tabung tabung = new Tabung(r, t);

        System.out.println("Volume Tabung = "
                + tabung.hitungVolume() + " cm3");

        System.out.println("Luas Permukaan Tabung = "
                + tabung.hitungLuasPermukaan() + " cm2");


        // POLYMORPHISM
        BangunRuang[] objek = {kubus, balok, tabung};
        
        for (BangunRuang bangun : objek) {
    System.out.println("Volume = "
            + bangun.hitungVolume() + " cm3");

    System.out.println("Luas Permukaan = "
            + bangun.hitungLuasPermukaan() + " cm2");
}

        System.out.println("\n======================================");
        System.out.println("       PROGRAM SELESAI DIJALANKAN");
        System.out.println("======================================");

        System.out.println("Jumlah objek bangun ruang: "
                + objek.length);

        input.close();
    }
}