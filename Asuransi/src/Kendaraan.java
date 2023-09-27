import com.Enum.JenisKendaraan;

public class Kendaraan {
    private String jenisKendaraan;
    private String platnomer;
    private String nomerSTNK;
    private String merek;
    private String modelKendaraan;
    private String warna;
    private JenisKendaraan kendaraan;

    public Kendaraan(){

    }

    public Kendaraan( JenisKendaraan kendaraan,String platnomer, String nomerSTNK, String merek, String modelKendaraan, String warna) {
        this.kendaraan = kendaraan;
        this.platnomer = platnomer;
        this.nomerSTNK = nomerSTNK;
        this.merek = merek;
        this.modelKendaraan = modelKendaraan;
        this.warna = warna;
    }



    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getPlatnomer() {
        return platnomer;
    }

    public void setPlatnomer(String platnomer) {
        this.platnomer = platnomer;
    }

    public String getNomerSTNK() {
        return nomerSTNK;
    }

    public void setNomerSTNK(String nomerSTNK) {
        this.nomerSTNK = nomerSTNK;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModelKendaraan() {
        return modelKendaraan;
    }

    public void setModelKendaraan(String modelKendaraan) {
        this.modelKendaraan = modelKendaraan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public String toString() {
        return "Kendaraan{" +
                "jenisKendaraan='" + jenisKendaraan + '\'' +
                ", platnomer='" + platnomer + '\'' +
                ", nomerSTNK='" + nomerSTNK + '\'' +
                ", merek='" + merek + '\'' +
                ", modelKendaraan='" + modelKendaraan + '\'' +
                ", warna='" + warna + '\'' +
                ", kendaraan=" + kendaraan +
                '}';
    }
}

