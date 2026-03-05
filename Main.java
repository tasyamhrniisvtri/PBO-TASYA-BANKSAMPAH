public class Main {
    public static void main(String[] args) {

        // 1. Buat objek Nasabah
        Nasabah n1 = new Nasabah("Tasya Maharani", 101, "Teba");

        // 2. Buat objek Sampah
        Sampah plastik = new Sampah("Plastik", "kg", 5000);

        // 3. Buat Transaksi (otomatis hitung total & tambah saldo)
        Transaksi t1 = new Transaksi("04-03-2026", 1, 2.5, n1, plastik);

        // 4. Tampilkan hasil transaksi
        System.out.println("=== DATA TRANSAKSI ===");
        t1.tampilkanTransaksi();

        System.out.println("\n=== PROFIL NASABAH ===");
        n1.tampilkanProfil();
    }
} mir cra buat akun githubnya gmn