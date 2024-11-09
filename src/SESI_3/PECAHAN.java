package SESI_3;
import java.util.Scanner;

public class PECAHAN {
    
    public static void main (String[] args){
        int jumlahUang, uang100Ribuan, uang50Ribuan, uang20Ribuan, uang10Ribuan, uang5Ribuan, uang2Ribuan, uang1Ribuan, uang500an, uang100an;
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Nilai Uang: "); 
        jumlahUang = sc.nextInt();

        uang100Ribuan = jumlahUang / 100000;
        jumlahUang = jumlahUang % 100000;
        System.out.println(uang100Ribuan + " lembar 100000");

        uang50Ribuan = jumlahUang / 50000;
        jumlahUang = jumlahUang % 50000;
        System.out.println(uang50Ribuan + " lembar 50000");

        uang20Ribuan = jumlahUang / 20000;
        jumlahUang = jumlahUang % 20000;
        System.out.println(uang20Ribuan + " lembar 20000");

        uang10Ribuan = jumlahUang / 10000;
        jumlahUang = jumlahUang % 10000;
        System.out.println(uang10Ribuan + " lembar 10000");

        uang5Ribuan = jumlahUang / 5000;
        jumlahUang = jumlahUang % 5000;
        System.out.println(uang5Ribuan + " lembar 5000");

        uang2Ribuan = jumlahUang / 2000;
        jumlahUang = jumlahUang % 2000;
        System.out.println(uang2Ribuan + " lembar 2000");

        uang1Ribuan = jumlahUang / 1000;
        jumlahUang = jumlahUang % 1000;
        System.out.println(uang1Ribuan + " lembar 1000");

        uang500an = jumlahUang / 500;
        jumlahUang = jumlahUang % 500;
        System.out.println(uang500an + " keping 500");

        uang100an = jumlahUang / 100;
        jumlahUang = jumlahUang % 100;
        System.out.println(uang100an + " keping 100");

        sc.close();
        
    }
}