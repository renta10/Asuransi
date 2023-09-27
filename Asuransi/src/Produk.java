import com.Enum.FrekuensiPembayaran;
import com.Enum.JenisProduk;
import com.Enum.Payment;

import java.util.HashMap;
import java.util.Map;

public class Produk {
    private String namaProduk;
    private JenisProduk jenisProduk;
    private FrekuensiPembayaran frekuensiPembayaran;
    private double pembayaran;
    private String manfaat;

    public Produk(){

    }

    public Produk(String namaProduk, JenisProduk jenisProduk, FrekuensiPembayaran frekuensiPembayaran, String manfaat) {
        this.namaProduk = namaProduk;
        this.jenisProduk = jenisProduk;
        this.frekuensiPembayaran = frekuensiPembayaran;
        this.pembayaran = pembayaran;
        this.manfaat = manfaat;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public JenisProduk getJenisProduk() {
        return jenisProduk;
    }

    public void setJenisProduk(JenisProduk jenisProduk) {
        this.jenisProduk = jenisProduk;
    }

    public FrekuensiPembayaran getFrekuensiPembayaran() {
        return frekuensiPembayaran;
    }

    public void setFrekuensiPembayaran(FrekuensiPembayaran frekuensiPembayaran) {
        this.frekuensiPembayaran = frekuensiPembayaran;
    }

    public double getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(double pembayaran) {
        this.pembayaran = pembayaran;
    }

    public String getManfaat() {
        return manfaat;
    }

    public void setManfaat(String manfaat) {
        this.manfaat = manfaat;
    }

    public static Map<String, Produk> detailProduk() {
        Map<String, Produk> produkMap = new HashMap<>();

        Produk sehatBersama = new Produk("Sehat Bersama", JenisProduk.KESEHATAN, FrekuensiPembayaran.BULANAN, "Claim perawatan kelas 1.");
        Produk sehatExtra = new Produk("Sehat Extra", JenisProduk.KESEHATAN, FrekuensiPembayaran.BULANAN, "Claim perawatan kelas VIP");
        Produk lifeKeluarga = new Produk("Life Keluarga", JenisProduk.JIWA, FrekuensiPembayaran.BULANAN, "Mendapatkan 500.000.000 apabila terjadi sesuatu pada tertanggung.");
        Produk lifeSpesial = new Produk("Life Special", JenisProduk.JIWA, FrekuensiPembayaran.TAHUNAN, "Mendapatkan 800.000.000 apabila terjadi sesuatu pada tertanggung.");
        Produk kendaraan = new Produk("Protection", JenisProduk.KENDARAAN, FrekuensiPembayaran.TAHUNAN, "mndapat ganti rugi sampai  100.000.000 bila terjadi sesuatu");
        Produk protectionPlus = new Produk("ProtectionPlus", JenisProduk.KENDARAAN, FrekuensiPembayaran.TAHUNAN, "Mendapat ganti rugi total lost apa bila terjadi sesuatu");

        produkMap.put("Sehat Bersama", sehatBersama);
        produkMap.put("Sehat Extra", sehatExtra);
        produkMap.put("Life Keluarga", lifeKeluarga);
        produkMap.put("Life Special", lifeSpesial);
        produkMap.put("Protection", kendaraan);
        produkMap.put("ProtectionPlus", protectionPlus);

        return produkMap;
    }

    public static void produkdipslay(){
          Map<String,Produk> produkMap = detailProduk();
        for(Produk produk :produkMap.values()){
            System.out.println(produk.namaProduk);
        }
    }


}
