public class EWalletPayment implements PaymentMethod {

   
    private String providerName;
    private double balance;
    private double transactionAmount;

    
    public EWalletPayment(String providerName, double initialBalance, double transactionAmount) {
        this.providerName = providerName;
        this.balance = initialBalance;
        this.transactionAmount = transactionAmount;
    }

   

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double getTransactionFee() {
        return 2000.0;
    }

    @Override
    public void processPayment() {
        double totalCost = this.transactionAmount + getTransactionFee();
        
        System.out.println("Memproses pembayaran sebesar Rp " + this.transactionAmount + "...");
        
        if (this.balance >= totalCost) {
            this.balance -= totalCost;
            System.out.println("✓ Pembayaran berhasil!");
            System.out.println("  Nominal: Rp " + this.transactionAmount);
            System.out.println("  Biaya transaksi: Rp " + getTransactionFee());
            System.out.println("  Total biaya: Rp " + totalCost);
        } else {
            System.out.println("✗ Pembayaran gagal! Saldo tidak cukup.");
            System.out.println("  Saldo Anda: Rp " + this.balance);
            System.out.println("  Total yang dibutuhkan: Rp " + totalCost);
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Detail Transaksi: Pembayaran dilakukan melalui " + this.providerName + " | Nominal: Rp " + this.transactionAmount + " | Biaya: Rp " + getTransactionFee();
    }
}