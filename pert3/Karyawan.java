class Karyawan {
    
    protected String nama;
    protected double gajiPokok;
    
    
    Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    
    
    void tampilInfo() {
        System.out.println("Nama: " + this.nama + " | Gaji Pokok: Rp " + this.gajiPokok);
    }
}