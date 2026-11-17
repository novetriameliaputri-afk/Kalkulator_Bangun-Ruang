/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KalkulatorBangunRuang;

// ABSTRACTION
abstract class BangunRuang {

    public abstract double hitungVolume();
    public abstract double hitungLuasPermukaan();
}

// INHERITANCE DAN ENCAPSULATION
class Kubus extends BangunRuang {

    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
}

// INHERITANCE DAN ENCAPSULATION
class Balok extends BangunRuang {

    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar,
                 double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar
                + panjang * tinggi
                + lebar * tinggi);
    }
}

// INHERITANCE DAN ENCAPSULATION
class Tabung extends BangunRuang {

    private double jariJari, tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari
                * (jariJari + tinggi);
    }
}