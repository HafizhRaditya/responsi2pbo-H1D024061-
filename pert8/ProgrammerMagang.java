public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {
    
    
    
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;


   
    
    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }


  
    
    @Override
    public double hitungGaji(int jamKerja) {
        double totalGaji = jamKerja * this.gajiPerJam;
        System.out.println("Nama: " + this.nama);
        System.out.println("Jam Kerja: " + jamKerja + " jam");
        System.out.println("Gaji per Jam: Rp " + this.gajiPerJam);
        System.out.println("Total Gaji: Rp " + totalGaji);
        return totalGaji;
    }
    
    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak " + this.nama + " diperpanjang selama " + durasiBulan + " bulan.");
    }
    
    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }


   
    
    @Override
    public void login(String pin) {
        if (pin.equals(this.pinRahasia)) {
            this.sedangLogin = true;
            System.out.println("Login berhasil! Selamat datang, " + this.nama);
        } else {
            System.out.println("Login gagal! PIN salah.");
        }
    }
    
    @Override
    public void logout() {
        this.sedangLogin = false;
        System.out.println(this.nama + " telah logout.");
    }
    
    @Override
    public String getRoleAkses() {
        return "Magang IT";
    }
}