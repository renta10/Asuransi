import com.Enum.Gender;
import com.Enum.Payment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Nasabah extends Prospect  {
    private String nomorNasabah;
    private String nomerKTP;
    private String statusKK;
    private Payment payment;
    private List<Polis> polis;
//    private Prospect prospect;

    public Nasabah(){

    }


    public Nasabah(int nomerProspek, String namaDepan, String namaBelakang, LocalDate tanggalLahir, String tempatLahir, Gender jenisKelamin, String pekerjaan) {
        super(nomerProspek, namaDepan, namaBelakang, tanggalLahir, tempatLahir, jenisKelamin, pekerjaan);
        this.polis = new ArrayList<>();
    }

    public Nasabah (String namaDepan, String namaBelakang, LocalDate tanggalLahir, String tempatLahir, Gender jenisKemlain, String pekerjaan, String nomorNasabah, String nomerKTP, String statusKK, Payment payment) {
        super(namaDepan, namaBelakang, tanggalLahir, tempatLahir, jenisKemlain, pekerjaan);
        this.nomorNasabah = nomorNasabah;
        this.nomerKTP = nomerKTP;
        this.statusKK = statusKK;
        this.payment = payment;
    }

    public List<Polis> getPolis() {
        return polis;
    }

    public String getNomorNasabah() {
        return nomorNasabah;
    }

    public void setNomorNasabah(String nomorNasabah) {
        this.nomorNasabah = nomorNasabah;
    }

    public String getStatusKK() {
        return statusKK;
    }

    public void setStatusKK(String statusKK) {
        this.statusKK = statusKK;
    }

    public String getNomerKTP() {
        return nomerKTP;
    }

    public void setNomerKTP(String nomerKK) {
        this.nomerKTP = nomerKK;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public void addPolis(Polis polis1){
        this.polis.add(polis1);
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "nomorNasabah='" + nomorNasabah + '\'' +
                ", nomerKTP='" + nomerKTP + '\'' +
                ", statusKK='" + statusKK + '\'' +
                ", payment=" + payment +
                ", polis=" + polis +
                '}';
    }

    public void addPolis(List<Polis> polis1){
        this.polis=polis1;


    }
    //
//    public Prospect getProspect() {
//        return prospect;
//    }
//
//    public void setProspecttoNasabah(Prospect prospect) {
//        this.prospect = prospect;
//    }
}
