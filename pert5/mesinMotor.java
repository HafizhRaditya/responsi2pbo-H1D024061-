class mesinMotor extends defaultMesin {
    // Variabel khusus mesin motor (tipeMotor)
    private String tipeMotor;

    // Constructor
    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor = tipe;
    }

    @Override
    void tampilInfo() {
        // Override info mesin motor
        System.out.println("Mesin Motor " + this.namaMesin + " | Tipe: " + this.tipeMotor + " | Tenaga: " + this.tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // Override performa mesin motor
        return this.tenagaHP * 1.2;
    }

    @Override
    String kategoriMesin() {
        // Override kategori
        return "Mesin Motor";
    }

    void suaraMesin() {
        // Suara mesin motor
        System.out.println(this.namaMesin + " → Brummm! Mesin motor menyala!");
    }
}
