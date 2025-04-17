package AliZainalAbidinZaky_2309033_Pertemuan9.utspbo;

public class LimasSegiEmpat {
    // Atribut private (enkapsulasi)
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    // Konstruktor tanpa parameter
    public LimasSegiEmpat() {
        this.luasAlas = 0;
        this.luasSelubungLimas = 0;
        this.tinggi = 0;
    }

    // Konstruktor dengan parameter
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }

    // Getter luas total
    public double getLuas() {
        return this.luasAlas + this.luasSelubungLimas;
    }

    // Getter volume
    public double getVolume() {
        return (1.0 / 3.0) * this.luasAlas * this.tinggi;
    }

    // Setter
    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    public void setLuasSelubung(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    // Cetak informasi
    public void cetakInfo() {
        System.out.println("Limas segi empat dengan luas alas : " + this.luasAlas +
                ", luas selubung limas : " + this.luasSelubungLimas +
                " dan tinggi : " + this.tinggi +
                ". Luasnya : " + String.format("%.2f", this.getLuas()) +
                ", sedangkan volumenya : " + String.format("%.2f", this.getVolume()));
    }
}

