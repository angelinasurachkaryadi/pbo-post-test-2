/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kosmetiktoko;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author USER
 */
public class KosmetikShop {
    public static List<produk> products;

    static{
        products = new ArrayList<>();
    }
    
    public static void tambahproduk(produk produkkosmetik) {
        products.add(produkkosmetik);
    }
    
    public void editproduk(int index, produk produkkosmetik) {
        products.set(index, produkkosmetik);
    }

    public static void hapusproduk(int index) {
        products.remove(index);
    }

    public static void tampilkanproduk() {
        for (produk produkkosmetik : products) {
            System.out.println(produkkosmetik.toString());
        }
    }
}

    
