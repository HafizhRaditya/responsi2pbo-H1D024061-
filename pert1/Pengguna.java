class Pengguna {
    
    int umur;
    double berat; 
    double tinggi; 
    final double faktorAktivitas = 1.2; 

    Pengguna(int umur, double berat, double tinggi) {
        this.umur = umur;
        this.berat = berat;
        this.tinggi = tinggi;
    }

    double hitungBMI() {
        double tinggiMeter = this.tinggi / 100.0;
        return this.berat / (tinggiMeter * tinggiMeter);
    }

    void tampilKategori() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        return this.berat * this.faktorAktivitas * 10.0;
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + this.umur + " tahun");
        System.out.println("Berat: " + this.berat + " kg");
        System.out.println("Tinggi: " + this.tinggi + " cm");
        System.out.printf("BMI: %.2f\n", hitungBMI());
        tampilKategori();
        System.out.printf("Kebutuhan Kalori: %.0f kal/hari\n", hitungKalori());
        System.out.println("====================================");
    }
}