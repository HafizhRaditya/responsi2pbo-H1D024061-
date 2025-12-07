class mesinTraktorListrik extends mesinTraktor {
    // Variabel khusus mesin traktor listrik (kapasitasBaterai)
    private double kapasitasBaterai;

    // Constructor
    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    void tampilInfo() {
        // Override info traktor listrik
        System.out.println("Mesin Traktor Listrik " + this.namaMesin + " | Tarik: " + this.kapasitasTarik + " ton | Baterai: " + this.kapasitasBaterai + " kWh | Tenaga: " + this.tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // Override performa traktor listrik
        return (this.tenagaHP * 0.9) + (this.kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        // Override kategori listrik
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        // Suara traktor listrik
        System.out.println(this.namaMesin + " → Bzzzzz! Mesin traktor listrik aktif!");
    }
}
