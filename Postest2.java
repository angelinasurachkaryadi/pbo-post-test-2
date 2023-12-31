/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.postest2;

import java.util.Scanner;
import kosmetiktoko.produk;
import kosmetiktoko.KosmetikShop;

/**
 *
 * @author USER
 */
public class Postest2 {
    
    public static void postest2(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            KosmetikShop KosmetikShop = new KosmetikShop();
            
            int pilihan;
            do {
                System.out.println("Menu Toko Kosmetik:");
                System.out.println("1. Menambah Produk");
                System.out.println("2. Mengedit Produk");
                System.out.println("3. Menghapus Produk");
                System.out.println("4. Menampilkan Produk");
                System.out.println("5. Keluar");
                System.out.print("Pilih (1-5)=> ");
                pilihan = scanner.nextInt();
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Nama Produk: ");
                        String nama = scanner.next();
                        System.out.print("Harga Produk: ");
                        double harga = scanner.nextDouble();
                        produk produkBaru = new produk(nama, harga);
                        KosmetikShop.tambahproduk(produkBaru);
                        System.out.println("Produk berhasil ditambahkan.");
                    }
                    case 2 -> {
                        System.out.print("Masukkan INDEKS produk yang ingin diedit: ");
                        int indexEdit = scanner.nextInt();
                        System.out.print("Nama Produk Baru: ");
                        String namaEdit = scanner.next();
                        System.out.print("Harga Produk Baru: ");
                        double hargaEdit = scanner.nextDouble();
                        produk produkedit = new produk(namaEdit, hargaEdit);
                        KosmetikShop.editproduk(indexEdit, produkedit);
                        System.out.println("Produk berhasil diedit.");
                    }
                    case 3 -> {
                        System.out.print("Masukkan INDEKS produk yang ingin dihapus: ");
                        int indexHapus = scanner.nextInt();
                        KosmetikShop.hapusproduk(indexHapus);
                        System.out.println("Produk berhasil dihapus.");
                    }
                    case 4 -> {
                        System.out.println("Daftar Produk Kosmetik :");
                        KosmetikShop.tampilkanproduk();
                    }
                    case 5 -> System.out.println("Terima kasih!Silahkan Datang Kembali");
                    default -> System.out.println("Pilihan salah. Silakan Coba Lagi .");
                }
            }while (pilihan != 5);
        }
    }
}
       
        
 


