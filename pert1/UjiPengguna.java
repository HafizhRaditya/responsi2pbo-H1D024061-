class UjiPengguna {
    public static void main(String[] args) {
        Pengguna p = new Pengguna(25, 60.0, 170.0);
        p.tampilInfo();

        System.out.println();
        System.out.println("--- Demonstrasi Konstanta FINAL ---");
        System.out.println("Nilai faktor aktivitas: " + p.faktorAktivitas);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi");
        System.out.println();
        System.out.println("Jika kita mencoba menulis (contoh, dikomentari karena menyebabkan error pada kompilasi):");
        System.out.println("// p.faktorAktivitas = 1.5; // -> compiler error: cannot assign a value to final variable faktorAktivitas");
    }
}
