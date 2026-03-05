public class Nasabah {

    // Atribut
    private String nama;
    private int idNasabah;
    private String alamat;
    private double saldoTerkumpul;

    // Constructor
    public Nasabah(String nama, int idNasabah, String alamat) {
        this.nama = nama;
        this.idNasabah = idNasabah;
        this.alamat = alamat;
        this.saldoTerkumpul = 0.0; // saldo awal
    }

    // Method tambah saldo
    public void tambahSaldo(double jumlah) {
        this.saldoTerkumpul += jumlah;
    }

    // Method tampilkan profil
    public void tampilkanProfil() {
        System.out.println("ID Nasabah  : " + idNasabah);
        System.out.println("Nama        : " + nama);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Saldo       : " + saldoTerkumpul);
    }

    // Getter saldo (optional biar aman)
    public double getSaldoTerkumpul() {
        return saldoTerkumpul;
    }
}