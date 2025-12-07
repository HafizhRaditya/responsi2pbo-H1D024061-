class Customer {
    // Buatkan atribut
    protected String nama;
    protected String idCustomer;
    protected int totalBelanja;

    // Sediakan constructor
    Customer(String nama, String idCustomer, int totalBelanja) {
        this.nama = nama;
        this.idCustomer = idCustomer;
        this.totalBelanja = totalBelanja;
    }

    void tampilkanInfo() {
        // Tampilkan data customer
        System.out.println("Nama: " + this.nama + " | ID: " + this.idCustomer + " | Total Belanja: Rp " + this.totalBelanja);
    }
}
