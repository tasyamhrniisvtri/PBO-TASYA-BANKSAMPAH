public class Transaksi {

    // Atribut
    private String tanggal;
    private int idTransaksi;
    private double beratSampah;
    private double totalNominal;

    private Nasabah nasabah;   // relasi ke Nasabah
    private Sampah sampah;     // relasi ke Sampah

    // Constructor
    public Transaksi(String tanggal, int idTransaksi, double beratSampah,
                     Nasabah nasabah, Sampah sampah) {

        this.tanggal = tanggal;
        this.idTransaksi = idTransaksi;
        this.beratSampah = beratSampah;
        this.nasabah = nasabah;
        this.sampah = sampah;

        this.totalNominal = hitungTotal();
        nasabah.tambahSaldo(this.totalNominal); // otomatis update saldo
    }

    // Method hitung total
    public double hitungTotal() {
        return beratSampah * sampah.getHargaPersatuan();
    }

    public void tampilkanTransaksi() {
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Jenis Sampah : " + sampah.getNamaJenis());
        System.out.println("Berat        : " + beratSampah);
        System.out.println("Total        : " + totalNominal);
    }
}