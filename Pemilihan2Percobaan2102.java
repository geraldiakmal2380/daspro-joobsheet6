import java.util.Scanner;

public class Pemilihan2Percobaan2102{

    
    public static void main(String args[]){

        Scanner no10 = new Scanner(System.in);
        int pilihan_menu;
        String member;
        double harga,total_bayar;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1.Rice Bowl");
        System.out.println("2.Ice tea");
        System.out.println("3. Paket Bundling(Ricebowl + Icetea)");
        System.out.println("------------------------------------");
        System.out.print("Masukan angka dari menu yang dipilih : ");
        pilihan_menu = no10.nextInt();
        no10.nextLine();
        System.out.print("apakah anda punya member(Y/N) : ");
        member = no10.next();
        System.out.println("------------------------------------");
        no10.close();
        if (member.equalsIgnoreCase("y")){
            double diskon = 0.1;
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga dari Rice Bowl = "+harga);
            }
            else if(pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga dari Ice tea = "+harga);
            }
            else if(pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga dari Paket Bundling = "+harga);

            }
            else{
                System.out.println("Masukan menu dengan benar");
                return;
            }
            total_bayar = harga-(harga*diskon);
            int total_bayarint = ((int)total_bayar);
            System.out.println("Total Bayar Setelah diskon = "+total_bayarint);
        }

        else if (member.equalsIgnoreCase("n")){
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga dari Rice Bowl = "+harga);
            }
            else if(pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga dari Ice tea = "+harga);
            }
            else if(pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga dari Paket Bundling = "+harga);

            }
            else{
                System.out.println("Masukan menu dengan benar");
                return;
            }
            total_bayar = harga;
            int total_bayarint = ((int)total_bayar);
            System.out.println("Total Bayar Tanpa diskon = "+total_bayarint);
        }
        }
        

    }
