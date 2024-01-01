package Kasirku;

import java.util.Scanner;


/**
 *
 * @author RAFA RAFI
 */
// Kelas Pemanggil
public class Pemanggil {
    public static void main(String[] args) {
        // Input Nama Kasir
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan Nama Kasir : ");
        String namaKasir = inputUser.nextLine();
        System.out.println("===============================");
        
        // Membuat Objek Penjualan
        Penjualan penjualan = new Penjualan(namaKasir);
        
        int pilihan;
        int x;
        do {
            System.out.println("Silahkan Pilih Menu Transaksi : ");
            System.out.println("1. Input data penjulan");
            System.out.println("2. Pembayaran");
            System.out.println("3. Keluar program");
            System.out.println("===============================");
            pilihan = inputUser.nextInt();           
            
            switch(pilihan) {
                case 1:
                    System.out.print("Masukkan Jumlah Barang : ");
                    int jumlahBarang = inputUser.nextInt();
                    penjualan.dataBrg = new DataBarang[jumlahBarang];
                    for (x = 0; x < penjualan.dataBrg.length; x++) {
                    penjualan.dataBrg[x] = new DataBarang();
                    
                    System.out.print("Barang ke : " + (x + 1));
                    System.out.println("\n===============================");
                    System.out.print("Masukkan kode barang   : "); 
                    penjualan.dataBrg[x].setKodeBarang(inputUser.next());
                    System.out.print("Masukkan nama barang   : "); 
                    penjualan.dataBrg[x].setNamaBarang(inputUser.next());                    
                    System.out.print("Masukkan harga barang  : "); 
                    penjualan.dataBrg[x].setHargaBarang(inputUser.nextFloat());
                    System.out.print("Masukkan jumlah barang : "); 
                    penjualan.dataBrg[x].setJumlahBeli(inputUser.nextInt());
                    System.out.println("\n===============================");
                }
                break;
                
                case 2:
                    if(penjualan.dataBrg != null) {
                        penjualan.tampilanDataPenjualan();
                    } else {
                        System.out.println("Belum ada data penjualan. Silahkan inpur data terlebih dahulu");
                    }
                    break;
                    
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
                    
                default:
                    System.err.println("Pilihan tidak valid, silahkan pilih lagi");    
            }
        } while (pilihan != 3);
    }
}
