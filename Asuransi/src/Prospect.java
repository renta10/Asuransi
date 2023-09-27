import com.Enum.Gender;
import com.Enum.StatusCutomer;

import java.time.LocalDate;

public class Prospect extends Person {
    private int nomerProspek;
    private StatusCutomer statusNasbah;



    public Prospect(){

    }

    public Prospect(int nomerProspek) {
        this.nomerProspek = nomerProspek;
    }


    public Prospect(String namaDepan, String namaBelakang, LocalDate tanggalLahir, String tempatLahir, Gender jenisKemlain, String pekerjaan) {
        super(namaDepan, namaBelakang, tanggalLahir, tempatLahir, jenisKemlain, pekerjaan);
    }

    public Prospect(int nomerProspek,String namaDepan, String namaBelakang, LocalDate tanggalLahir, String tempatLahir, Gender jenisKelamin, String pekerjaan) {
        super(namaDepan, namaBelakang, tanggalLahir, tempatLahir, jenisKelamin, pekerjaan);
        this.nomerProspek = nomerProspek;
        this.statusNasbah = StatusCutomer.Prospect;
    }

    public int getNomerProspek() {
        return nomerProspek;
    }

    public void setNomerProspek(int nomerProspek) {
        this.nomerProspek = nomerProspek;
    }

    public StatusCutomer getStatusNasbah() {
        return statusNasbah;
    }

    public void setStatusNasbah(StatusCutomer statusNasbah) {
        this.statusNasbah = statusNasbah;
    }
}
