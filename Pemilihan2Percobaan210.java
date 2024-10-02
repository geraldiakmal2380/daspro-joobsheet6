import java.util.Scanner;

public class Pemilihan2Percobaan210 {
    public static void main(String[] args) {
        String menu;
        Boolean member;
        int jumlah_beli;
        double total_bayar,diskon,barangkaliharga,nominaldiskon;



        Scanner nomer10 = new Scanner(System.in);

        System.out.print("punya member?(True/False) : ");
        member = nomer10.nextBoolean();

        if (member){
            diskon = 0.1;
            System.out.println("Pilih menu Anda");
            System.out.println("1.kopi");
            System.out.println("2.teh");
            System.out.println("3.roti");
            System.out.print("Masukan Pilihan Anda (kopi/teh/roti): ");

            menu = nomer10.next();
            System.out.println("Berapa banyak? : ");
            jumlah_beli = nomer10.nextInt();
            nomer10.close();
            if(menu.equals("kopi")){
                double hargamenu = 12000;
                barangkaliharga = hargamenu*jumlah_beli;
                nominaldiskon = diskon*barangkaliharga;

                total_bayar = barangkaliharga - nominaldiskon;
                System.out.println("Pesanan anda "+menu+" dengan jumlah "+jumlah_beli+" dan diskon sebesar "+diskon*100+"%"+" dan total "+total_bayar);


            }
            else if(menu.equals("teh")){
                double hargamenu = 7000;
                barangkaliharga = hargamenu*jumlah_beli;
                nominaldiskon = diskon*barangkaliharga;

                total_bayar = barangkaliharga - nominaldiskon;
                System.out.println("Pesanan anda "+menu+" dengan jumlah "+jumlah_beli+" dan diskon sebesar "+diskon*100+"%"+" dan total "+total_bayar);

            }
            else if (menu.equals("roti")){
                double hargamenu = 20000;
                barangkaliharga = hargamenu*jumlah_beli;
                nominaldiskon = diskon*barangkaliharga;

                total_bayar = barangkaliharga - nominaldiskon;
                System.out.println("Pesanan anda "+menu+" dengan jumlah "+jumlah_beli+" dan diskon sebesar "+diskon*100+"%"+" dan total "+total_bayar);
            }
            else{
                System.out.println("mohon masukan jawaban yang valid");
            }
            
            
            


       

        }
        else{
            System.out.println("Pilih menu Anda");
            System.out.println("1.kopi");
            System.out.println("2.teh");
            System.out.println("3.roti");
            System.out.print("Masukan Pilihan Anda (kopi/teh/roti): ");

            menu = nomer10.next();
            System.out.println("Berapa banyak? : ");
            jumlah_beli = nomer10.nextInt();
            nomer10.close();
            if(menu.equals("kopi")){
                double hargamenu = 12000;
                barangkaliharga = hargamenu*jumlah_beli;

                total_bayar = barangkaliharga ;
                System.out.println("Pesanan anda "+menu+" dengan jumlah "+jumlah_beli+" dan diskon sebesar "+0+"%"+" dan total "+total_bayar);


            }
            else if(menu.equals("teh")){
                double hargamenu = 7000;
                barangkaliharga = hargamenu*jumlah_beli;

                total_bayar = barangkaliharga;
                System.out.println("Pesanan anda "+menu+" dengan jumlah "+jumlah_beli+" dan diskon sebesar "+0+"%"+" dan total "+total_bayar);

            }
            else if (menu.equals("roti")){
                double hargamenu = 20000;
                barangkaliharga = hargamenu*jumlah_beli;

                total_bayar = barangkaliharga;
                System.out.println("Pesanan anda "+menu+" dengan jumlah "+jumlah_beli+" dan diskon sebesar "+0+"%"+" dan total "+total_bayar); 
        }



    }
}
}