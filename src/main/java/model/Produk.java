/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Produk {
    private int idProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(int idProduk, String namaProduk, double harga, int stok) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    
    public int getIdProduk() {
        return idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void tampilkanInfo() {
        System.out.println("ID       : " + idProduk);
        System.out.println("Nama     : " + namaProduk);
        System.out.println("Harga    : Rp" + harga);
        System.out.println("Stok     : " + stok);
    }
}
