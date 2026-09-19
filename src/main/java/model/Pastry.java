/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Pastry extends Produk {
    private String rasa;

    public Pastry(int idProduk, String namaProduk, double harga, int stok, String rasa) {
        super(idProduk, namaProduk, harga, stok);
        this.rasa = rasa;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Rasa     : " + rasa);
    }  
}
