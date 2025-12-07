public class UjiSDM {
    public static void main(String[] args) {
        
       
        
        ProgrammerMagang programmer = new ProgrammerMagang("Andi", 50000.0, "1234");
        
        System.out.println("=== PENGUJIAN SISTEM KARYAWAN MAGANG ===\n");
        
        
        System.out.println("--- Perhitungan Gaji ---");
        programmer.hitungGaji(160);
        
        System.out.println("\n--- Status Cuti ---");
        System.out.println(programmer.getStatusCuti());
        
        System.out.println("\n--- Tes Login Gagal ---");
        programmer.login("9999");
        
        System.out.println("\n--- Tes Login Berhasil ---");
        programmer.login("1234");
        
        System.out.println("\n--- Role Akses ---");
        System.out.println("Role: " + programmer.getRoleAkses());
        
        System.out.println("\n--- Perpanjangan Kontrak ---");
        programmer.perpanjangKontrak(6);
        
        System.out.println("\n--- Logout ---");
        programmer.logout();
    }
}