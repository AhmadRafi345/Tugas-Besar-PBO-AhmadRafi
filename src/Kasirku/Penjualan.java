package Kasirku;

/**
 *
 * @author RAFA RAFI
 */

// Kelas Penjualan Dengan Konsep Inheritance dan Polymorphism
public class Penjualan implements Pembayaran {
    String namaKasir;
    DataBarang[] dataBrg;
    
    //Contructor
    public Penjualan(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    Penjualan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Implementasi Interface Pembayaran
    @Override
    public double hitungBayar() {
        double totalBayar = 0;
        for (DataBarang barang : dataBrg) {
            totalBayar += barang.hitungBayar();
        }
        return totalBayar;
    }
    // Menampilkan Data Penjualan
    public void tampilanDataPenjualan() {
        System.out.println("===============================");
        System.out.println("DATA PENJUALAN BARANG");
        System.out.println("PT KOMENG");
        System.out.println("Nama Kasir : " + namaKasir);
        System.out.println("===============================\n");
        System.out.println("================================================================================");
        System.out.printf("%-5s %-15s %-20s %-15s %-12s %-12s\n", "No. ", "Kode Barang", "Nama Barang", "Harga Barang", "Jumlah Beli", "Bayar");
        System.out.println("================================================================================");
        
        for (int x = 0; x < dataBrg.length; x++) {
            System.out.printf("%-5d %-15s %-20s %-15.2f %-12d %-12.2f\n", (x + 1), dataBrg[x].getKodeBarang(), dataBrg[x].getNamaBarang(), dataBrg[x].getHargaBarang(), dataBrg[x].getJumlahBeli(), dataBrg[x].hitungBayar());
        }
        System.out.println("================================================================================");
        System.out.println("Total Bayar : " + hitungBayar());
        System.out.println("===============================");
    }
}
