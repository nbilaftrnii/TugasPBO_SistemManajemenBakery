# 🍰Sistem Manajemen Bakery ꩜ .ᐟ

**Nama** : Nabila Fitriani 

**NIM**  : 2509116063  

**Kelas** : B  

**Mata Kuliah** : Pemograman Berorientasi Objek

---
## 📌 Deskripsi Studi Kasus

Program yang dibuat adalah **Sistem Manajemen Bakery** berbasis **Command Line Interface (CLI)** menggunakan bahasa pemrograman **Java**.

Sistem ini digunakan untuk mengelola data produk bakery dan pesanan pelanggan. Produk yang tersedia terdiri dari **Pastry dan Cake**. Pengguna dapat melihat daftar produk, membuat pesanan, menghitung total pembayaran, melakukan pembayaran, melihat kembalian, serta melihat daftar pesanan yang telah dibuat.

Program ini dibuat dengan menerapkan konsep Pemrograman Berorientasi Objek (OOP), seperti class, object, constructor, encapsulation, **inheritance**, polymorphism, dan ArrayList.

🔹 **Fitur yang tersedia:**
- Menampilkan dan mengelola produk.
- Membuat pesanan dan pembayaran.
- Menghitung total harga dan kembalian.
  
---
## 🗃️ Hierarki Class

Struktur Package dari program ini terdiri dari beberapa package dan class yang memiliki fungsinya masing-masing dalam mengelola sistem bakery.

<img width="206" height="161" alt="image" src="https://github.com/user-attachments/assets/9113f4e0-0ef9-420c-b416-bd9c2a94d0e6" />  

### 📊 Diagram Hierarki Class

                   ┌─────────────────────────────────┐
                   │             Produk              │  << SUPERCLASS
                   ├─────────────────────────────────┤
                   │ - idProduk   : int              │
                   │ - namaProduk : String           │
                   │ - harga      : double           │
                   │ - stok       : int              │
                   ├─────────────────────────────────┤
                   │ + getIdProduk()   : int         │
                   │ + getNamaProduk() : String      │
                   │ + getHarga()      : double      │
                   │ + getStok()       : int         │
                   │ + setStok(int)    : void        │
                   │ + tampilkanInfo() : void        │
                   └─────────────────────────────────┘
                                   ▲
                                   │ extends (inheritance)
                   ┌──────────────────────────────┐
                   │                              │
    ┌──────────────────────────┐    ┌──────────────────────────┐
    │          Pastry          │    │           Cake           │  << SUBCLASS
    ├──────────────────────────┤    ├──────────────────────────┤
    │ - rasa : String          │    │ - ukuranCake : String    │
    ├──────────────────────────┤    ├──────────────────────────┤
    │ + tampilkanInfo() : void │    │ + tampilkanInfo() : void │
    │   (override)             │    │   (override)             │
    └──────────────────────────┘    └──────────────────────────┘


    ┌────────────────────────────────────┐
    │              Pesanan               │
    ├────────────────────────────────────┤
    │ - idPesanan     : int              │
    │ - namaPelanggan : String           │         Pesanan berelasi
    │ - produk        : Produk           |         (asosiasi) dengan
    │ - jumlah        : int              │         class Produk
    ├────────────────────────────────────┤
    │ + hitungTotal()      : double      │
    │ + tampilkanPesanan() : void        │
    └────────────────────────────────────┘

- `Produk` berperan sebagai **superclass** (parent class) yang menyimpan atribut umum milik seluruh produk bakery: idProduk, namaProduk, harga, dan stok. Semua atribut bersifat private sehingga hanya bisa diakses melalui getter dan setter (encapsulation).
- `Pastry` dan `Cake` adalah **subclass** (child class) yang mewarisi seluruh atribut dan method dari Produk, lalu menambahkan atribut khususnya masing-masing (rasa dan ukuranCake).
- `Pesanan` tidak berada dalam hierarki pewarisan, melainkan memiliki relasi asosiasi dengan Produk. Sebuah pesanan memiliki satu objek produk sebagai referensi untuk menghitung total harga.
- `Main` berada pada package terpisah dan bertugas menjalankan program, menampilkan menu, serta mengelola ArrayList<Produk> dan ArrayList<Pesanan>.
  
---
## 💻Penerapan Inheritance

Inheritance diterapkan pada class `Pastry` dan `Cake` yang mewarisi class Produk.

**1. Superclass >> Produk.java**

   <img width="516" height="241" alt="image" src="https://github.com/user-attachments/assets/13624fa1-2b50-4428-b136-d881d8bfe56e" />

`Produk` merupakan **superclass** yang menjadi dasar untuk class `Pastry` dan `Cake`. Class ini berisi atribut dan method umum yang dimiliki oleh setiap produk bakery, seperti ID   produk, nama produk, harga, dan stok.

**2. Subclass >> Pastry.java**

   <img width="721" height="124" alt="image" src="https://github.com/user-attachments/assets/aaa15323-d037-4df4-bfef-8b2c4e87a167" />

Class `Pastry` merupakan **subclass** dari `Produk` yang memiliki atribut tambahan berupa jenis pastry. Hubungan inheritance diterapkan menggunakan **extends Produk**, sehingga `Pastry` dapat menggunakan atribut dan method yang berasal dari `Produk`. 
   
**3. Subclass >> Cake.java**

   <img width="752" height="128" alt="image" src="https://github.com/user-attachments/assets/c31f5585-b5b3-4166-acfd-57104dd4e0e5" />

Class `Cake` juga merupakan **subclass** dari `Produk`. Class ini memiliki atribut tambahan berupa ukuran cake dan dapat menggunakan atribut serta method yang diwarisi dari `Produk`.

**4. Penerapan pada Method**

Inheritance juga diterapkan pada method `tampilkanInfo()`. Method ini pertama kali dibuat pada superclass `Produk` untuk menampilkan informasi dasar produk seperti ID, nama, harga, dan stok.
  
  <img width="355" height="125" alt="image" src="https://github.com/user-attachments/assets/a02e4d5c-4f7d-4ce7-b3d6-f7e1cc37664c" />

Method `tampilkanInfo()` kemudian **dioverride** pada class `Pastry`. Pada subclass ini, `super.tampilkanInfo()` digunakan untuk memanggil method dari superclass `Produk`, kemudian ditambahkan informasi khusus berupa jenis pastry.

  <img width="312" height="108" alt="image" src="https://github.com/user-attachments/assets/71e66e91-01a9-45bb-911c-029a896860ac" />

Hal yang sama diterapkan pada class `Cake`. Method `tampilkanInfo()` **dioverride** untuk menambahkan informasi khusus berupa ukuran cake setelah informasi dasar dari `Produk` ditampilkan.

  <img width="368" height="105" alt="image" src="https://github.com/user-attachments/assets/bc17d1fa-f87e-4260-8b2e-297b4d7beabb" />

Penggunaan `super.tampilkanInfo()` menunjukkan bahwa subclass memanggil method yang berasal dari superclass `Produk`, kemudian mengembangkan method tersebut dengan menambahkan informasi sesuai jenis produknya. Dengan demikian, `Produk` menyediakan fungsi dasar, sedangkan `Pastry` dan `Cake` menyesuaikannya sesuai kebutuhan masing-masing.

---
## ⚙️ Penjelasan Alur Program

**1. Menu Utama** 

Program menampilkan menu utama yang berisi pilihan untuk menampilkan produk, membuat pesanan, melihat pesanan, dan keluar dari program. User memilih menu dengan memasukkan nomor pilihan. Setelah proses pada menu selesai, program akan kembali ke menu utama sampai user memilih menu Keluar.

**Kode:**

    int pilihan = 0;
        
        do {
            System.out.println();
            System.out.println("====================================");
            System.out.println("           Bake w Love 🥐");
            System.out.println("====================================");
            System.out.println("1. Tampilkan Produk");
            System.out.println("2. Tambah Pesanan");
            System.out.println("3. Tampilkan Pesanan");
            System.out.println("4. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih menu : ");

            pilihan = input.nextInt();
            input.nextLine();

   **Output:**
    
   <img width="264" height="157" alt="image" src="https://github.com/user-attachments/assets/a347ff0d-18c9-47d7-8ff8-3dd6491849e6" />
<br><br>

**2. Menampilkan Produk**

User memilih menu Tampilkan Produk, kemudian sistem mengecek data pada daftarProduk. Jika terdapat produk, sistem menampilkan seluruh produk menggunakan method tampilkanInfo(). Informasi yang ditampilkan menyesuaikan jenis produk, seperti rasa pada Pastry dan ukuran pada Cake.

**Kode:**

    switch (pilihan) {
                case 1:
                    System.out.println();
                    System.out.println("---------- DAFTAR PRODUK ----------");

                    if (daftarProduk.isEmpty()) {
                        System.out.println("Belum ada produk.");
                    } else {
                        for (Produk produk : daftarProduk) {
                            produk.tampilkanInfo();
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;

  **Output:**

   <img width="252" height="359" alt="image" src="https://github.com/user-attachments/assets/3d3b0247-9415-4014-bbc3-72b3e2a311c9" />
<br><br>
   
**3. Tambah Pesanan**

User memilih menu Tambah Pesanan, kemudian memasukkan ID pesanan, nama pelanggan, ID produk, dan jumlah pesanan. Sistem mencari produk berdasarkan ID dan mengecek stok. Jika data valid, sistem menghitung total harga dan menampilkan invoice berisi detail pesanan. Setelah itu user memasukkan jumlah uang pembayaran. Sistem akan mengecek apakah uang yang dibayarkan mencukupi. Jika kurang, pembayaran ditolak dan user diminta melakukan pembayaran kembali. Jika cukup, sistem menghitung kembalian dan pesanan berhasil disimpan.

**Kode:**

    case 2:
                    System.out.println();
                    System.out.println("---------- TAMBAH PESANAN ----------");

                    System.out.print("ID Pesanan       : ");
                    int idPesanan = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama Pelanggan   : ");
                    String namaPelanggan = input.nextLine();

                    System.out.print("ID Produk        : ");
                    int idProduk = input.nextInt();

                    Produk produkDipilih = null;

                    for (Produk produk : daftarProduk) {
                        if (produk.getIdProduk() == idProduk) {
                            produkDipilih = produk;
                            break;
                        }
                    }
                    
                    if (produkDipilih == null) {
                        System.out.println("Produk tidak ditemukan.");
                        break;
                    }

                    System.out.print("Jumlah Pesanan   : ");
                    int jumlah = input.nextInt();

                    if (jumlah <= 0) {
                        System.out.println("Jumlah pesanan harus lebih dari 0.");
                        break;
                    }

                    if (jumlah > produkDipilih.getStok()) {
                        System.out.println("Stok produk tidak mencukupi.");
                        break;
                    }
                    
                    Pesanan pesanan = new Pesanan(
                            idPesanan,
                            namaPelanggan,
                            produkDipilih,
                            jumlah
                    );

  **Output:**

   <img width="261" height="393" alt="image" src="https://github.com/user-attachments/assets/aae185cf-b0f5-4c9f-991a-db3520e19159" />
<br><br>

**4. Tampilkan Pesanan**

User memilih menu Tampilkan Pesanan, kemudian sistem mengecek apakah sudah terdapat pesanan yang tersimpan. Jika ada, sistem menampilkan seluruh pesanan satu per satu melalui method tampilkanPesanan(). Informasi yang ditampilkan meliputi ID pesanan, nama pelanggan, produk yang dipesan, jumlah pesanan, dan total harga. Setelah semua pesanan ditampilkan, program kembali ke menu utama.

**Kode:**

    case 3:
                    System.out.println();
                    System.out.println("---------- DAFTAR PESANAN ----------");

                    if (daftarPesanan.isEmpty()) {
                        System.out.println("Belum ada pesanan.");
                    } else {

                        for (Pesanan pesananData : daftarPesanan) {
                            pesananData.tampilkanPesanan();
                            System.out.println("-----------------------------------");
                        }
                    }

                    break;

  **Output:**

   <img width="259" height="256" alt="image" src="https://github.com/user-attachments/assets/ed78b38a-7e48-4822-942c-84352d8fad7d" />
<br><br>

**5. Keluar**

User memilih menu Keluar, kemudian program menampilkan pesan penutup. Setelah itu, perulangan berhenti karena pilihan user sudah bernilai 4, sehingga program selesai dijalankan.

**Kode:**

    case 4:
                    System.out.println();
                    System.out.println("See u!");
                    System.out.println("Bake w Love 🥐");
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia.");
                    break;
            }

        } while (pilihan != 4);

        input.close();
    }
}

**Output:**

   <img width="517" height="169" alt="image" src="https://github.com/user-attachments/assets/83473a6a-c928-4768-8944-0c52c504655d" />
