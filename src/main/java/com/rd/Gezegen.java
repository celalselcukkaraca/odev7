package com.rd;

public enum Gezegen {
    // Gezegenlerin tanimi ve ozellikleri (siralama, uzaklik, yaricap, donme suresi)
    MERKUR(1, 57900000L, 2440, 58),
    VENUS(2, 108200000L, 6052, 243),
    DUNYA(3, 149600000L, 6371, 1),
    MARS(4, 227900000L, 3389, 1.03),
    JUPITER(5, 778500000L, 69911, 0.41),
    SATURN(6, 1434000000L, 58232, 0.45),
    URANUS(7, 2871000000L, 25362, 0.72),
    NEPTUN(8, 4495000000L, 24622, 0.67);

    // Gezegen ozellikleri
    private final int siralamaNumarasi;
    private final long uzaklik; // km cinsinden Gunes'e uzaklik
    private final int yaricap;  // km cinsinden yaricap
    private final double donmeSuresi; // gun cinsinden donme suresi

    // Constructor
    Gezegen(int siralamaNumarasi, long uzaklik, int yaricap, double donmeSuresi) {
        this.siralamaNumarasi = siralamaNumarasi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    // Gezegen bilgilerini yazdiran metot
    public void displayInfo() {
        System.out.println("Gezegen: " + this.name());
        System.out.println("Siralama Numarasi: " + siralamaNumarasi);
        System.out.println("Gunes'e Uzaklik: " + uzaklik + " km");
        System.out.println("Yaricap: " + yaricap + " km");
        System.out.println("Donme Suresi: " + donmeSuresi + " gun");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        // Tum gezegenlerin bilgilerini yazdir
        for (Gezegen gezegen : Gezegen.values()) {
            gezegen.displayInfo();
        }
    }
}
