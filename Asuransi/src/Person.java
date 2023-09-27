import com.Enum.Gender;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Person {
    private String namaDepan;
    private String namaBelakang;
    private LocalDate tanggalLahir;
    private String tempatLahir;
    private Gender jenisKelamin;
    private String pekerjaan;


    public Person(){

    }

    public Person(String namaDepan, String namaBelakang, LocalDate tanggalLahir,
                  String tempatLahir, Gender jenisKelamin, String pekerjaan) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.tanggalLahir = tanggalLahir;
        this.tempatLahir = tempatLahir;
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public LocalDate getTanggalLahir() {
        return this.tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Gender getJenisKemlain() {
        return jenisKelamin;
    }

    public void setJenisKemlain(Gender jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    public void getnamalengkap(){
        System.out.println(namaDepan + " " + namaBelakang);
    }

    public Period umur(){
        Period umur =Period.between(tanggalLahir,LocalDate.now());
        return umur;
    }

    public static String getTanggalFormatindo (LocalDate tanggalLahir){
        Locale indonesia = new Locale("id","ID");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy",indonesia);
        String tanggalLahir1 = tanggalLahir.format(dateTimeFormatter) ;
        return tanggalLahir1;
    }

}
