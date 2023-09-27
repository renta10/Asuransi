import com.Enum.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static String[] menuAwal;
    private static String[] prospekMenu;
    private static String[] produk;
    private static Scanner inputUser;

    public static void main(String[] args) {
//        inputUser = new Scanner(System.in);
//        printMenu();
//        mainMenu();

    }

    public static void mainMenu(){
        tampilkanMenu(menuAwal);
        System.out.print("Masukan pilihan :");
        String input = inputUser.nextLine().trim();
        if(!validateInputMenu(input,menuAwal.length)){
            mainMenu();
        }
        switch (input){
            case "1":
                menuProspect();

            case "2":
                menuCustomer();

            case "3":
                System.exit(0);
            default:
        }


    }

    public static void menuProspect(){
        tampilkanMenu(prospekMenu);
        System.out.print("Masukan pilihan :");
        String input = inputUser.nextLine();
        switch (input){
            case "1":
                Fungsi.displayProspek();
                Fungsi.fillProspek();
                System.out.println("\nmenambahkan prospect baru.....\n");

                mainMenu();
            case "2":
                Fungsi.displayProspek();
                Fungsi.prospektoNasabah();
                Fungsi.displayProspek();

            case "3":
                mainMenu();

            case "4":
                System.exit(0);
            default:
                System.err.println("input salah ");
                menuProspect();
        }

    }

    public static void menuCustomer(){
        tampilkanMenu(produk);
        System.out.print("Masukan pilihan :");
        String input = inputUser.nextLine();
        switch (input){
            case "1":
                Fungsi.displayNasabah();
                Fungsi.buyProduct();
                mainMenu();
                break;
            case "2":
                Fungsi.printnasbah();
                break;
            case "3":
                mainMenu();
            case "4":
                System.exit(0);
            default:
                System.err.println("input salah ");
                mainMenu();

        }

    }




    public static void printMenu(){

    menuAwal = new String[] {" Menu Prospect"," Menu Customer"," Exit Application"};
    prospekMenu = new String[]{" add Prospect", " Prospect To Customer"," Main Menu"," Exit Application"};
    produk = new String[]{" Buy Product"," Detail Policy"," Main Menu"," Exit Application"};

    }

    public static void tampilkanMenu (String[] menu){
        for(int index = 0; index < menu.length; index++){
            System.out.println((index + 1) + menu[index]);
        }
    }

    public static boolean validateInputMenu(String input, int totalMenu){
        try{
            int menuNumber = Integer.parseInt(input);
            if(menuNumber <= totalMenu && menuNumber >= 1){
                return true;
            }
        }catch (Exception exception){
            System.out.println("Input bukan berupa bilangan bulat");
        }
        System.out.println("Input harus bilangan bulat antara 1 - " + totalMenu);
        return false;
    }

}
