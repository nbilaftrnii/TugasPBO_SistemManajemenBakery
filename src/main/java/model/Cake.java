/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Cake extends Produk {
    private String ukuranCake;

    public Cake(int idProduk, String namaProduk, double harga, int stok, String ukuranCake) {
        super(idProduk, namaProduk, harga, stok);
        this.ukuranCake = ukuranCake;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran Cake : " + ukuranCake);
    }   
}
