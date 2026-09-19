/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Produk> daftarProduk = new ArrayList<>();
        ArrayList<Pesanan> daftarPesanan = new ArrayList<>();

        // Data awal produk
        daftarProduk.add(
                new Pastry(1, "Croissant", 25000, 10, "Butter")
        );

        daftarProduk.add(
                new Pastry(2, "Danish Pastry", 30000, 8, "Cokelat")
        );
        
        daftarProduk.add(
                new Cake(3, "Chocolate Cake", 55000, 5, "Medium")
        );

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
                    
                    // Pesanan
                    daftarPesanan.add(pesanan);
                    
                    // Mengurangi Stok
                    produkDipilih.setStok(
                            produkDipilih.getStok() - jumlah
                    );
                    
                    // Menampilkan Total
                    double total = pesanan.hitungTotal();

                    System.out.println();
                    System.out.println("====================================");
                    System.out.println("              INVOICE");
                    System.out.println("====================================");
                    System.out.println("Pelanggan : " + namaPelanggan);
                    System.out.println("Produk    : " + produkDipilih.getNamaProduk());
                    System.out.println("Jumlah    : " + jumlah);
                    System.out.println("Total     : Rp" + total);
                    System.out.println("====================================");
                    
                    // Pembayaran
                    double bayar;

                    do {
                        System.out.print("Uang Bayar : Rp");
                        bayar = input.nextDouble();

                        if (bayar < total) {
                            System.out.println("Uang tidak cukup!");
                        }

                    } while (bayar < total);

                    double kembalian = bayar - total;

                    System.out.println("Kembalian  : Rp" + kembalian);
                    System.out.println("====================================");
                    System.out.println("Terima kasih telah berbelanja ♡");
                    System.out.println("Bake w Love 🥐");
                    
                    daftarPesanan.add(pesanan);

                    break;
                    
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
                        
                case 4:
                    System.out.println();
                    System.out.println("Selamat Datang!");
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
