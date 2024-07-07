package tokobuah;

public class BuahDetail extends Buah {
    private int stok;  // Atribut tambahan untuk stok buah

    // Constructor untuk menginisialisasi nama, harga, dan stok
    public BuahDetail(String nama, double harga, int stok) {
        super(nama, harga);
        this.stok = stok;
    }

    // Setter untuk mengubah nilai stok
    public void setStok(int stok) {
        this.stok = stok;
    }

    // Getter untuk mendapatkan nilai stok
    public int getStok() {
        return stok;
    }

    //(metode tampilkanInfo untuk menyertakan stok)
    @Override
    public String tampilkanInfo() {
        return "Nama Buah: " + getNama() + "\nHarga: " + getHarga() + "\nStok: " + getStok();
    }
}