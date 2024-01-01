package Kasirku;

/**
 *
 * @author RAFA RAFI
 */
//Kelas Data Barang Dengan Konsep Encapsulation dan Getter - Setter
public class DataBarang implements Pembayaran {
    String kodeBarang, namaBarang;
    float hargaBarang;
    int jumlahBeli;

    //Getter dan Setter
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public float getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(float hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    //Implementasi Interface Pembayaran
    @Override
    public double hitungBayar() {
        return hargaBarang * jumlahBeli;
    }
}
