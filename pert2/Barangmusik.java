class BarangMusik {
    // Deklarasikan variabel/state yang diperlukan di sini
    String kode;
    String nama;
    double harga;
    int stok;
    
    // Constructor pertama: hanya kode dan nama
    BarangMusik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.harga = 0.0;
        this.stok = 0;
    }
    
    // Constructor kedua: kode, nama, dan harga
    BarangMusik(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;
    }
    
    // Constructor ketiga: kode, nama, harga, dan stok (lengkap)
    BarangMusik(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    void ubahHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }
    
    void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    void tampilInfo() {
        System.out.println("Alat musik " + this.nama + " | Kode: " + this.kode + " | Harga: Rp " + this.harga + " | Stok: " + this.stok + " unit");
    }
}