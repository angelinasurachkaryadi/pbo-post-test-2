/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kosmetiktoko;

/**
 *
 * @author USER
 */
public final class produk {
    private final String nama;
    private final double harga;
    

    public produk (String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }
    
    
    public double getHarga() {
        return harga;
    }
    
    @Override
    public final String toString() {
        return "Nama Produk: " + nama + ", Harga Produk: " + harga;
    }
}
