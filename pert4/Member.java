class Member extends Customer {
    // Tambahkan atribut tambahan
    private int poinReward;
    private String level;

    // Buat constructor dengan super
    Member(String nama, String idCustomer, int totalBelanja, int poinReward, String level) {
        super(nama, idCustomer, totalBelanja);
        this.poinReward = poinReward;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        // Panggil super, lalu tampilkan data tambahan
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + this.poinReward + " | Level: " + this.level);
    }
}
