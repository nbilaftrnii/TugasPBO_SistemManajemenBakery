# 🍰Sistem Manajemen Bakery ꩜ .ᐟ

**Nama** : Nabila Fitriani 

**NIM**  : 2509116063  

**Kelas** : B  

---
## 📌 Deskripsi Studi Kasus

Program yang dibuat adalah **Sistem Manajemen Bakery** berbasis **Command Line Interface (CLI)** menggunakan bahasa pemrograman **Java**.

Sistem ini digunakan untuk mengelola data produk bakery dan pesanan pelanggan. Produk yang tersedia terdiri dari **Pastry** dan **Cake**. Pengguna dapat melihat daftar produk, membuat pesanan, menghitung total pembayaran, melakukan pembayaran, melihat kembalian, serta melihat daftar pesanan yang telah dibuat.

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

- **Produk** berperan sebagai **superclass** (parent class) yang menyimpan atribut umum milik seluruh produk bakery: idProduk, namaProduk, harga, dan stok. Semua atribut bersifat private sehingga hanya bisa diakses melalui getter dan setter (encapsulation).
- **Pastry** dan **Cake** adalah **subclass** (child class) yang mewarisi seluruh atribut dan method dari Produk, lalu menambahkan atribut khususnya masing-masing (rasa dan ukuranCake).
- **Pesanan** tidak berada dalam hierarki pewarisan, melainkan memiliki relasi asosiasi dengan Produk. Sebuah pesanan memiliki satu objek produk sebagai referensi untuk menghitung total harga.
- **Main** berada pada package terpisah dan bertugas menjalankan program, menampilkan menu, serta mengelola ArrayList<Produk> dan ArrayList<Pesanan>.
  
---
## 💻Penerapan Inheritance

Inheritance diterapkan pada class Pastry dan Cake yang mewarisi class Produk.

**1. Subclass >> Pastry.java**

   <img width="721" height="124" alt="image" src="https://github.com/user-attachments/assets/aaa15323-d037-4df4-bfef-8b2c4e87a167" />
   
**2. Subclass >> Cake.java**

   <img width="752" height="128" alt="image" src="https://github.com/user-attachments/assets/c31f5585-b5b3-4166-acfd-57104dd4e0e5" />

Penggunaan **extends** Produk menunjukkan bahwa Pastry dan Cake merupakan turunan dari Produk. Dengan inheritance, kedua class tersebut dapat menggunakan atribut dan method yang terdapat pada class Produk.

---
## ⚙️ Penjelasan Alur Program

**1. Menu Utama**   

   <img width="264" height="157" alt="image" src="https://github.com/user-attachments/assets/a347ff0d-18c9-47d7-8ff8-3dd6491849e6" />

   Program menampilkan menu utama yang berisi pilihan untuk melihat produk, membuat pesanan, melakukan pembayaran, dan melihat data pesanan. User dapat memilih menu dengan memasukkan nomor sesuai fitur yang ingin digunakan.

**2. Menampilkan Produk**

   <img width="252" height="359" alt="image" src="https://github.com/user-attachments/assets/3d3b0247-9415-4014-bbc3-72b3e2a311c9" />

   User memilih menu Tampilkan Produk, kemudian sistem menampilkan data produk berupa ID, nama, harga, stok, serta informasi tambahan sesuai jenis produk seperti rasa pada Pastry dan ukuran pada Cake.
   
**3. Tambah Pesanan**

   <img width="261" height="393" alt="image" src="https://github.com/user-attachments/assets/aae185cf-b0f5-4c9f-991a-db3520e19159" />

   User memilih menu Tambah Pesanan, kemudian memasukkan ID pesanan, nama pelanggan, ID produk, dan jumlah pesanan. Sistem menampilkan invoice berisi detail pesanan dan total harga. User kemudian memasukkan uang pembayaran, sistem memvalidasi pembayaran dan menghitung kembalian.

**4. Tampilkan Pesanan**

   <img width="259" height="256" alt="image" src="https://github.com/user-attachments/assets/ed78b38a-7e48-4822-942c-84352d8fad7d" />

   User memilih menu Tampilkan Pesanan, kemudian sistem menampilkan daftar pesanan yang telah dibuat. Informasi yang ditampilkan meliputi ID pesanan, nama pelanggan, produk, jumlah, dan total harga.

**5. Keluar**

   <img width="517" height="169" alt="image" src="https://github.com/user-attachments/assets/83473a6a-c928-4768-8944-0c52c504655d" />

   User memilih menu Keluar, kemudian program menampilkan pesan penutup dan mengakhiri program. Program berhasil dijalankan hingga selesai dengan status BUILD SUCCESS.
