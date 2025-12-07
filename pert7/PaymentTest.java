public class PaymentTest {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===\n");

       
        EWalletPayment myWallet = new EWalletPayment("OVO", 150000, 50000);

        
        System.out.println("--- SEBELUM TRANSAKSI ---");
        System.out.println("Saldo awal: Rp " + myWallet.getBalance());

       
        System.out.println("\n--- PROSES PEMBAYARAN ---");
        myWallet.processPayment();

        
        System.out.println("\n--- SETELAH TRANSAKSI ---");
        System.out.println("Sisa saldo: Rp " + myWallet.getBalance());
        System.out.println(myWallet.getPaymentDetails());
    }
}