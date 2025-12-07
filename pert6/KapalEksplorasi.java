public class KapalEksplorasi extends KendaraanGalaksi {

    
    private int modulScan; 

    
    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }

   
    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int energiDibutuhkan = jarak * 2; // Konsumsi energi: 2% per km
        if (getLevelEnergi() < energiDibutuhkan) {
            System.out.println("Energi tidak cukup untuk menjelajah!");
        } else {
            kurangiEnergi(energiDibutuhkan);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        tambahEnergi(jumlah);
        System.out.println("Energi kapal eksplorasi ditambah. Energi sekarang: " + getLevelEnergi() + "%");
    }

   
    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}