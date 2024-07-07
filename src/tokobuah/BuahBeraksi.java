package tokobuah;

import java.util.Scanner;

public class BuahBeraksi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BuahDetail[] buahs = new BuahDetail[3];  // Array untuk menyimpan objek BuahDetail

            for (int i = 0; i < buahs.length; i++) {
                try {
                    System.out.print("Masukkan Nama Buah ke-" + (i + 1) + ": ");
                    String nama = scanner.nextLine();  // Input nama buah
                    
                    System.out.print("Masukkan Harga Buah ke-" + (i + 1) + ": ");
                    double harga = scanner.nextDouble();  // Input harga buah
                    scanner.nextLine(); 
                    
                    System.out.print("Masukkan Stok Buah ke-" + (i + 1) + ": ");
                    int stok = scanner.nextInt();  // Input stok buah
                    scanner.nextLine(); 

                    buahs[i] = new BuahDetail(nama, harga, stok);  // Membuat objek BuahDetail dan menyimpannya di array
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    System.out.println("Silakan masukkan data dengan benar.");
                    scanner.nextLine(); // Membersihkan input yang tidak valid
                    i--; // Mengulangi input untuk buah yang sama
                }
            }

            System.out.println("\nData Buah:");
            for (BuahDetail buah : buahs) {
                System.out.println(buah.tampilkanInfo());  // Menampilkan informasi setiap buah
                System.out.println();
            }
        }
    }
}