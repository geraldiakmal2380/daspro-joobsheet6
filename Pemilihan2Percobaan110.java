/**
 * Pemilihan2Percobaan110
 */
import java.util.Scanner;
public class Pemilihan2Percobaan110 {

     public static void main(String[] args) {
        int tahun;

        Scanner no10 = new Scanner(System.in);

        System.out.print("Masukan tahun : ");
        tahun = no10.nextInt();
        
        no10.close();
        if (tahun%4 == 0){
        
            if (tahun%100 !=0 ){

                System.out.println("Tahun Kabisat");
            }

            else{
                System.out.println("Bukan Tahun Kabisat");
            }

        }
        else {
            System.out.println("Bukan Tahun Kabisat");
        }




     }
}