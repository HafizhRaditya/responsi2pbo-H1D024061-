public abstract class KendaraanGalaksi {


    private String namaKendaraan;
    private int levelEnergi;         // 0–100
    private int kapasitasPenumpang;

   
    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100; // default saat dibuat pasti 100%
    }

    
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }
    
  
    protected void kurangiEnergi(int jumlah) {
        this.levelEnergi -= jumlah;
        if (this.levelEnergi < 0) this.levelEnergi = 0; // Jaga agar tidak minus
    }
    
    protected void tambahEnergi(int jumlah) {
        this.levelEnergi += jumlah;
        if (this.levelEnergi > 100) this.levelEnergi = 100; // Jaga agar tidak lebih dari 100
    }

    
    public final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " awak");
    }

   
    public abstract void aktifkanMesin();
    public abstract void jelajah(int jarak);
    public abstract void isiEnergi(int jumlah);
}