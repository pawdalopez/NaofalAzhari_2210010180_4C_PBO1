package tokobuah;

public class Buah {
    private String nama;  // Atribut untuk nama buah
    private double harga;  // Atribut untuk harga buah

    // Constructor untuk menginisialisasi nama dan harga
    public Buah(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Setter untuk mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter untuk mengubah nilai harga
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Getter untuk mendapatkan nilai nama
    public String getNama() {
        return nama;
    }

    // Getter untuk mendapatkan nilai harga
    public double getHarga() {
        return harga;
    }

    // Metode untuk menampilkan informasi buah
    public String tampilkanInfo() {
        return "Nama Buah: " + getNama() + "\nHarga: " + getHarga();
    }
}