import com.Enum.Gender;
import com.Enum.JenisKendaraan;
import com.Enum.Payment;
import com.Enum.StatusCutomer;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Fungsi {
    private static Prospect prospect;
    private static Map<Integer, Nasabah> prospectMap = new HashMap();
    private static Scanner inputUser;



    public static void fillProspek() {

        inputUser = new Scanner(System.in);

        System.out.print("Nama Depan : ");
        String inputNamaDepan = inputUser.nextLine().trim();
        System.out.print("Nama Belakang : ");
        String inputNamaBelakang = inputUser.nextLine().trim();

        LocalDate inputTanggalLahir = tanggalLahirValidasi();
        System.out.print("Tempat Lahir :  ");
        String inputTempatLahir = inputUser.nextLine().trim();
        Gender gender = getGender();
        System.out.print("Pekerjaan :");
        String inputPekerjaan = inputUser.nextLine().trim();

        Nasabah nasabah = new Nasabah(prospectMap.size() + 1, inputNamaDepan, inputNamaBelakang, inputTanggalLahir, inputTempatLahir, gender, inputPekerjaan);
        prospectMap.put(prospectMap.size() + 1, nasabah);

    }

    public static void prospektoNasabah() {
        System.out.print("Masukan nomor prospect yang ingin dijadikan nasabah :");
        Integer input = Integer.parseInt(inputUser.nextLine());

        System.out.print("Masukan nomer KTP :");
        String inputKtp = inputUser.nextLine();

        System.out.print("Masukan status KK :");
        String inputStatusKK = inputUser.nextLine();

        Payment pembayaran = getPaymet();
        setToNasabah(input, inputKtp, inputStatusKK, pembayaran);
    }

    public static void setToNasabah(Integer nomorProspect, String noKtp, String statusKK, Payment metodePembayaran) {
        prospectMap.get(nomorProspect).setNomorNasabah(LocalDate.now().getMonthValue() + "/" + LocalDate.now().getYear() + "/" + nomorProspect);
        prospectMap.get(nomorProspect).setNomerKTP(noKtp);
        prospectMap.get(nomorProspect).setStatusNasbah(StatusCutomer.Nasabah);
        prospectMap.get(nomorProspect).setStatusKK(statusKK);
        prospectMap.get(nomorProspect).setPayment(metodePembayaran);

    }

//    public static LocalDate formatDate (String tanggal){
//        Locale indonesia = new Locale("id","ID");
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy",indonesia);
//        LocalDate tanggalLahir = LocalDate.parse(tanggal,dateTimeFormatter);
//        return tanggalLahir;
//    }

    public static LocalDate tanggalLahirValidasi() {
        LocalDate tanggalLahir;
        while (true) {
            try {
                System.out.print("Tanggal Lahir (dd/MM/yyyy): ");
                String tanggalLahirString = inputUser.nextLine();
                tanggalLahir = LocalDate.parse(tanggalLahirString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                break;
            } catch (Exception e) {
                System.out.println("format salah, silahkan coba lagi.");
            }
        }
        return tanggalLahir;
    }

    public static Gender getGender() {
        while (true) {
            System.out.print("masukan jenis Kelamin(L/P) :");
            String gender = inputUser.nextLine().toUpperCase().trim();
            if (gender.equals("L")) {
                return Gender.L;
            } else if (gender.equals("P")) {
                return Gender.P;
            } else {
                System.out.println("input Salah coba lagi ");

            }
        }

    }

    public static Payment getPaymet() {
        while (true) {
            System.out.print("Masukan Metode Pembayaran ");
            String pembayaran = inputUser.nextLine().toUpperCase().trim();
            if (pembayaran.equals("CC")) {
                return Payment.CC;
            } else if (pembayaran.equals("AC")) {
                return Payment.AC;
            } else if (pembayaran.equals("VP")) {
                return Payment.VP;
            } else {
                System.out.println("input salah");
            }
        }
    }

    public static void displayProspek() {
        for (Map.Entry<Integer, Nasabah>
                displayprospect : prospectMap.entrySet()) {
            System.out.println("No " + (displayprospect.getKey() + ", " + displayprospect.getValue().getNamaDepan() + " " + displayprospect.getValue().getNamaBelakang() + " ," + displayprospect.getValue().getJenisKemlain().getLabel() + ", " + Person.getTanggalFormatindo(displayprospect.getValue().getTanggalLahir())) + " (" + displayprospect.getValue().getTempatLahir() + "), " + displayprospect.getValue().getPekerjaan() + " " + displayprospect.getValue().getStatusNasbah());
        }
    }

    public static void displayNasabah() {
        for (Map.Entry<Integer, Nasabah> dispalayNasabah : prospectMap.entrySet()) {
            if (dispalayNasabah.getValue().getStatusNasbah().name().equals(StatusCutomer.Nasabah.name())) {
                System.out.println("No " + (dispalayNasabah.getValue().getNomorNasabah() + ", " + dispalayNasabah.getValue().getNamaDepan() + " " + dispalayNasabah.getValue().getNamaBelakang() + " ," + dispalayNasabah.getValue().getJenisKemlain().getLabel() + ", " + Person.getTanggalFormatindo(dispalayNasabah.getValue().getTanggalLahir())) + " (" + dispalayNasabah.getValue().getTempatLahir() + "), " + dispalayNasabah.getValue().getPekerjaan() +
                        "\n" + " KTP :" + dispalayNasabah.getValue().getNomerKTP() + ", Status KK : " + dispalayNasabah.getValue().getStatusKK() + ", Payment : " + dispalayNasabah.getValue().getPayment().getLabel() + "\n" + "========================================================================================");
            }
        }
    }

    public static void buyProduct() {
        System.out.print("\nPilih Nomor Customer: ");
        String nomorNasabah = inputUser.nextLine().trim();
        if (!prospectMap.values().isEmpty()) {
            System.out.println("Pilih nama Product: ");
            String inputNamaProduk = inputUser.nextLine().trim();
           if (cekProduk(inputNamaProduk)){
               if(inputNamaProduk.equals("Protection")|| inputNamaProduk.equals("ProtectionPlus")){

               }else{
                   System.out.println("Pilih nomor Customer tertanggung: ");
                   String nomerTertanggung = inputUser.nextLine();
                   InputPolis(nomorNasabah,inputNamaProduk,nomerTertanggung);
                   cekNomerNasabah(nomorNasabah);
               }
           }

        } else {
            System.out.println("Nomor Nasabah yang di input tidak ada di daftar.");
            buyProduct();
        }


    }

    public static void InputPolis(String nomorNasabah, String inputNamaProduk, String nomerTertanggung){
        for (Nasabah value : prospectMap.values()) {
            if (value.getNomorNasabah().equals(nomorNasabah)) {
                if ( inputNamaProduk.equals("Sehat Extra") || inputNamaProduk.equals("Life Spesial")) {
                    if (value.getNomorNasabah().equals(nomerTertanggung)) {
//                        Polis polis =;
                        value.addPolis( new Polis(value, Produk.detailProduk().get(inputNamaProduk)));
                    }
                }else {
                    value.addPolis( new Polis(value, Produk.detailProduk().get(inputNamaProduk)));
                }
            }
        }
    }


    public static void inputPolisKendaraan(String nomorNasabah,String namaProduk, Kendaraan kendaraan){
        for (Nasabah value : prospectMap.values()){
            if(value.getNomorNasabah().equals(nomorNasabah)){
                if (namaProduk.equals("Protection")||namaProduk.equals("ProtectionPlus")){
                   Polis polis = new Polis(kendaraan,Produk.detailProduk().get(namaProduk));
                }

            }
        }


    }






    public static boolean cekNomerNasabah(String nomerNasabah) {
        boolean isValid = false;
        for (Nasabah value : prospectMap.values()) {
            if (value.getNomorNasabah().equals(nomerNasabah)) {
                isValid = true;
                break;
            } else {
                isValid = false;
            }
        }
        return isValid;
    }

    public static boolean cekProduk(String namaProduk) {
        boolean isValid = false;
        for (Produk value : Produk.detailProduk().values()) {
            if (value.getNamaProduk().equals(namaProduk)) {
                isValid = true;
                break;
            } else {
                isValid = false;
            }
        }
        return isValid;
    }

    private static void buyProductCarProtection(String nomerNasabah, String namaProduk) {
        System.out.println("Input data kendaraan: ");
        System.out.print("Jenis Kendaraan: ");
        JenisKendaraan jenisKendaraan = VehicleTypeValidation(inputUser.next());
        System.out.println("Nomor Polisi: ");
        inputUser.nextLine();
        String nomorPolisi = inputUser.nextLine().trim();
        System.out.println("Nomor STNK: ");
        String nomorSTNK = inputUser.nextLine().trim();
        System.out.println("Merk Kendaraan: ");
        String merk = inputUser.nextLine().trim();
        System.out.println("Model Kendaraan: ");
        String model = inputUser.nextLine().trim();
        System.out.println("Warna Kendaraan: ");
        String warna = inputUser.nextLine().trim();

        Kendaraan kendaraan = new Kendaraan(jenisKendaraan,nomorPolisi,nomorSTNK,merk,model,warna);
        inputPolisKendaraan(nomerNasabah,namaProduk,kendaraan);
        System.out.println("...menambahkan polis ke Customer.");

    }



    private static JenisKendaraan VehicleTypeValidation(String jenisKendaraan) {
        while (true) {
            switch (jenisKendaraan.toUpperCase().trim()) {
                case "MOTOR": return JenisKendaraan.MOTOR;
                case "MOBIL": return JenisKendaraan.MOBIL;
                default: {
                    System.out.println("input salah harap masukan Motor atau Mobil");
                }
            }
        }
    }


    public static void printnasbah (){
        System.out.print("masukan nomer nasabah :");
        String input = inputUser.nextLine();
        displayDetailPolis(input);
    }

    private static void displayDetailPolis(String nomorNasabah){
        for (Nasabah value : prospectMap.values()) {
            if (value.getNomorNasabah().equals(nomorNasabah)) {
               value.getPolis();
               for(Polis polis : value.getPolis() ){
                   if (polis.getKendaraan() == null) {
                       polis.printInfoSehatJiwa();
                   }else {
                       polis.printInfoPolisKendaraan();
                   }
               }
            }
        }

    }
}


