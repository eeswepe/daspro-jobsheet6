import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        double diskon = 0.0;

        System.out.print("Masukkan Jenis Buku : ");
        jenisBuku = input.nextLine();
        System.out.print("Masukkan Jumlah Buku : ");
        jumlahBuku = input.nextInt();

        if(jenisBuku.equalsIgnoreCase("kamus")){
            diskon = 0.1;
            if(jumlahBuku > 2){
                diskon += 0.02;
            }
        }else if(jenisBuku.equalsIgnoreCase("novel")){
            diskon = 0.07;
            if(jumlahBuku > 3){
                diskon += 0.02;
            }else{
                diskon += 0.01;
            }
        }else{
            if(jumlahBuku > 3){
                diskon = 0.05;
            }
        }

        System.out.println("Total Diskon = " + diskon);
    }
}