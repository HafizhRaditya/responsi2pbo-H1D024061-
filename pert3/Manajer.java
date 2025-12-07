
class Manajer extends Karyawan {
    
    private double tunjangan;
    
    
    Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    
    
    @Override
    void tampilInfo() {
        System.out.println("Nama: " + this.nama + " | Gaji Pokok: Rp " + this.gajiPokok + " | Tunjangan: Rp " + this.tunjangan);
        System.out.println("Total Pendapatan: Rp " + (this.gajiPokok + this.tunjangan));
    }
}