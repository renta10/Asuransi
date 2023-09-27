import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Polis {
    private Nasabah nasabahPolis;
    private LocalDate tanggalPembelian;
    private Produk produkPolis;
    private Kendaraan kendaraan;

    public Polis() {

    }

    public Polis(Nasabah nasabahPolis, Produk produkPolis) {
        this.nasabahPolis = nasabahPolis;
        this.tanggalPembelian = LocalDate.now();
        this.produkPolis = produkPolis;

    }

    public Polis(Kendaraan kendaraan, Produk produk) {
        this.kendaraan = kendaraan;
        this.tanggalPembelian = LocalDate.now();
        this.produkPolis = produk;
    }

    public Nasabah getNasabahPolis() {
        return nasabahPolis;
    }

    public void setNasabahPolis(Nasabah nasabahPolis) {
        this.nasabahPolis = nasabahPolis;
    }

    public LocalDate getTanggalPembelian() {
        return tanggalPembelian;
    }

    public void setTanggalPembelian(LocalDate tanggalPembelian) {
        this.tanggalPembelian = tanggalPembelian;
    }

    public Produk getProdukPolis() {
        return produkPolis;
    }

    public void setProdukPolis(Produk produkPolis) {
        this.produkPolis = produkPolis;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }


    public void printInfoPolisKendaraan(){
        DateTimeFormatter formatBulan = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("\n======================POLICY INFO======================\n" +
                "Product: " + produkPolis.getNamaProduk() + "\n" +
                "Tanggal Mulai: " + getTanggalPembelian().format(formatBulan) + "\n" +
                "Jenis Kendaraan: " + kendaraan.getJenisKendaraan() + "\n" +
                "Nomor Polisi: " + kendaraan.getPlatnomer() + "\n" +
                "Nomor Stnk: " + kendaraan.getNomerSTNK() + "\n" +
                "Merek Kendaraan: " + kendaraan.getMerek() + "\n" +
                "Model Kendaraan: " + kendaraan.getModelKendaraan() + "\n" +
                "Warna Kendaraan: " + kendaraan.getWarna()
                + "\n=======================================================\n"
        );
    }

    public void printInfoSehatJiwa(){
        DateTimeFormatter formatBulan = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("\n======================POLICY INFO======================\n" +
                "Tertangung: " + nasabahPolis.getNamaDepan() + " " + nasabahPolis.getNamaBelakang() +"\n"+
                "Product: " + produkPolis.getNamaProduk() + "\n" +
                "Tanggal Mulai Di jalankan: " + getTanggalPembelian().format(formatBulan) + "\n" +
//                "Model Kendaraan: " + kendaraan.getModelKendaraan() + "\n" +
                "Manfaat: " + produkPolis.getManfaat()
                + "\n=======================================================\n"
        );
    }

    @Override
    public String toString() {
        return "Polis{" +
                "nasabahPolis=" + nasabahPolis +
                ", tanggalPembelian=" + tanggalPembelian +
                ", produkPolis=" + produkPolis +
                ", kendaraan=" + kendaraan +
                '}';
    }
}
