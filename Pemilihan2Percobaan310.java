import java.util.Scanner;
public class Pemilihan2Percobaan310 {
    public static void main(String[] args) {
        Scanner no10 = new Scanner(System.in);
        String kategori;
        int penghasilan,gajibersih;
        double pajak = 0;

        System.out.print("masukan kategori pekerjaan : ");
        kategori = no10.nextLine();
        System.out.println("Masukan Jumlah Penghasilan : ");
        penghasilan = no10.nextInt();
        no10.close();
        if (kategori.equals("pekerja")){
            if (penghasilan <= 2000000){
                pajak = 0.1;
            }
            else if (penghasilan <= 3000000){
                pajak = 0.15;
            }
            else{
                pajak = 0.2;
            }
            gajibersih = (int)(penghasilan-(penghasilan*pajak));
            System.out.println("Penghasil Bersih : "+gajibersih);
        }
        else if (kategori.equalsIgnoreCase("pebisnis")){
            if (penghasilan <= 2500000){
                pajak = 0.15;
            }
            else if (penghasilan <= 3500000){
                pajak = 0.2;
            }
            else{
                pajak = 0.25;
            }
            gajibersih = (int)(penghasilan-(penghasilan*pajak));
            System.out.println("Penghasil Bersih : "+gajibersih);
        }
        else{
            System.out.println("Kategori salah");
        }
    }
}
