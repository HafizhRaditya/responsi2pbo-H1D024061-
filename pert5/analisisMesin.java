class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] mesinArray = new defaultMesin[5];

        // Isi array dengan objek mesinMotor
        mesinArray[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        mesinArray[1] = new mesinMotor("Yamaha R25", 250, "Sport");

        // Isi array dengan objek mesinTraktor
        mesinArray[2] = new mesinTraktor("Kubota MX5200", 520, 4.5);

        // Isi array dengan objek mesinTraktorListrik
        mesinArray[3] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        mesinArray[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info masing-masing mesin
        for (int i = 0; i < mesinArray.length; i++) {
            mesinArray[i].tampilInfo();
            System.out.println("Kategori: " + mesinArray[i].kategoriMesin());
            System.out.printf("Performa: %.1f\n", mesinArray[i].nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");

        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (int i = 0; i < mesinArray.length; i++) {
            if (mesinArray[i] instanceof mesinMotor) {
                ((mesinMotor) mesinArray[i]).suaraMesin();
            } else if (mesinArray[i] instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) mesinArray[i]).suaraMesin();
            } else if (mesinArray[i] instanceof mesinTraktor) {
                ((mesinTraktor) mesinArray[i]).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        int indexMax = 0;
        double performaMax = mesinArray[0].nilaiPerforma();
        
        for (int i = 1; i < mesinArray.length; i++) {
            if (mesinArray[i].nilaiPerforma() > performaMax) {
                performaMax = mesinArray[i].nilaiPerforma();
                indexMax = i;
            }
        }
        
        System.out.println(mesinArray[indexMax].namaMesin + " → " + performaMax);

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Logika sorting 3 performa tertinggi
        // Bubble sort untuk mengurutkan
        for (int i = 0; i < mesinArray.length - 1; i++) {
            for (int j = 0; j < mesinArray.length - i - 1; j++) {
                if (mesinArray[j].nilaiPerforma() < mesinArray[j + 1].nilaiPerforma()) {
                    // Swap
                    defaultMesin temp = mesinArray[j];
                    mesinArray[j] = mesinArray[j + 1];
                    mesinArray[j + 1] = temp;
                }
            }
        }

        // Tampilkan 3 terbaik
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + mesinArray[i].namaMesin + " → " + mesinArray[i].nilaiPerforma());
        }
    }
}
