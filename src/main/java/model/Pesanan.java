/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Pesanan {
    private int idPesanan;
    private String namaPelanggan;
    private Produk produk;
    private int jumlah;

    public Pesanan(int idPesanan, String namaPelanggan, Produk produk, int jumlah) {
        this.idPesanan = idPesanan;
        this.namaPelanggan = namaPelanggan;
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public double hitungTotal() {
        return produk.getHarga() * jumlah;
    }

    public void tampilkanPesanan() {
        System.out.println("ID Pesanan    : " + idPesanan);
        System.out.println("Pelanggan     : " + namaPelanggan);
        System.out.println("Produk        : " + produk.getNamaProduk());
        System.out.println("Jumlah        : " + jumlah);
        System.out.println("Total Harga   : Rp" + hitungTotal());
    }
}
