import java.util.Scanner;
public class Flowcharttugaspertemuan6 {
    public static void main(String[] args) {
        String hari,jenisbuku;
        int banyak_buku;
        double diskon,tambahandiskon;
        Scanner no10 = new Scanner(System.in);
        System.out.println("Selamat datang di toko buku");
        System.out.print("Hari apa sekarang? : ");
        hari = no10.nextLine();
        System.out.print("Beli buku apa?(kamus/novel/lainnya) : ");
        jenisbuku = no10.nextLine();
        System.out.println("berapa banyak");
        banyak_buku = no10.nextInt();
        no10.close();

        if (hari.equalsIgnoreCase("rabu")){
            if (jenisbuku.equalsIgnoreCase("kamus")){
                diskon = 0.1;
                if (banyak_buku >2){
                    tambahandiskon = 0.02;
                    System.out.println("Anda membeli "+jenisbuku+" dengan jumlah "+banyak_buku+" dan diskon sebsesar "+diskon*100+"%"+" bonus diskon "+tambahandiskon*100+"%");
                }
                else{
                    System.out.println("Anda membeli "+jenisbuku+" dengan jumlah "+banyak_buku+" dan diskon sebsesar "+diskon*100+"%");
                }

            }
            else if (jenisbuku.equalsIgnoreCase("novel")){
                diskon = 0.7;
                if (banyak_buku > 3){
                    tambahandiskon = 0.02;
                    System.out.println("Anda membeli "+jenisbuku+" dengan jumlah "+banyak_buku+" dan diskon sebsesar "+diskon*100+"%"+" bonus diskon "+tambahandiskon*100+"%");
                }
                else{
                    tambahandiskon = 0.01;
                    System.out.println("Anda membeli "+jenisbuku+" dengan jumlah "+banyak_buku+" dan diskon sebsesar "+diskon*100+"%"+" bonus diskon "+tambahandiskon*100+"%");
                }
            }
            else{
                if (banyak_buku >3){
                    diskon = 0.05;
                    System.out.println("Anda membeli "+jenisbuku+" dengan jumlah "+banyak_buku+" dan diskon sebsesar "+diskon*100+"%");
                }
            }
        }

    }
}
