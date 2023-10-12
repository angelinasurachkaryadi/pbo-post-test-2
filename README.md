# pbo-post-test-2
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
Package postest2: adalah package utama dari Toko Kosmetik.terdapat menu pilihan opsi.


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

Package kosmetiktoko : adalah package entitas.KosmetikShop adalah kelas yang menyimpan dan mengelola menambah produk,edit produk,hapus produk, dan menampilkan produk 


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
sedangkan produk adalah kelas entitas yang mewakili produk kosmetik tersebut.
Gunanya Best Practices adalah pada Kelas produk dideklarasikan sebagai final.Properti nama dan harga diinisialisasi sekali dan tidak dapat diubah karena di-set dalam konstruktor. 
Metode toString diberi keyword final supaya tidak dapat di-overide oleh subclass.



