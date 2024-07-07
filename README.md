# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buah`, `BuahDetail`, dan `BuahBeraksi` adalah contoh dari class.

```bash
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
```

2. **Object** adalah instance dari class. Pada kode ini, `BuahDetail[] buahs = new BuahDetail[3];` adalah contoh pembuatan object.

```bash
BuahDetail[] buahs = new BuahDetail[3];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `harga` adalah contoh atribut.

```bash
String nama;
String harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Buah` dan `BuahDetail`.

```bash
public Buah(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

public BuahDetail(String nama, double harga, int stok) {
        super(nama, harga);
        this.stok = stok;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setHarga` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }


public void setHarga(double harga) {
        this.harga = harga;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getHarga`, dan `getStok` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama; 
private double harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BuahDetail` mewarisi `Buah` dengan sintaks `extends`.

```bash
public class BuahDetail extends Buah {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkaninfo(String)` di `Buah` merupakan overloading method `tampilkaninfo` dan `tampilkaninfo` di `BuahDetail` merupakan override dari method `tampilkaninfo` di `Buah`.

```bash
public String tampilkanInfo() {
        return "Nama Buah: " + getNama() + "\nHarga: " + getHarga();
    }

@Override
public String tampilkanInfo() {
        return "Nama Buah: " + getNama() + "\nHarga: " + getHarga() + "\nStok: " + getStok();
    }
}
```

10. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < buahs.length; i++) {
                try {
```

11. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan Nama Buah ke-" + (i + 1) + ": ");
                    String nama = scanner.nextLine();  
                    
                    System.out.print("Masukkan Harga Buah ke-" + (i + 1) + ": ");
                    double harga = scanner.nextDouble();  
                    scanner.nextLine(); 
                    
                    System.out.print("Masukkan Stok Buah ke-" + (i + 1) + ": ");
                    int stok = scanner.nextInt();  
                    scanner.nextLine(); 

System.out.println(buah.tampilkanInfo()); 
System.out.println();
```

12. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `BuahDetail[] buahs = new BuahDetail[3];;` adalah contoh penggunaan array.

```bash
BuahDetail[] buahs = new BuahDetail[3];
```

13. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    0    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **95** |

## Pembuat

Nama: Naofal Azhari
NPM: 2210010180
