public class Sampah {

    // Atribut
    private String namaJenis;
    private String satuan;
    private double hargaPersatuan;

    // Constructor
    public Sampah(String namaJenis, String satuan, double hargaPersatuan) {
        this.namaJenis = namaJenis;
        this.satuan = satuan;
        this.hargaPersatuan = hargaPersatuan;
    }

    // Method update harga
    public void updateHarga(double hargaBaru) {
        this.hargaPersatuan = hargaBaru;
    }

    // Getter harga (dibutuhkan Transaksi)
    public double getHargaPersatuan() {
        return hargaPersatuan;
    }

    public String getNamaJenis() {
        return namaJenis;
    }
}