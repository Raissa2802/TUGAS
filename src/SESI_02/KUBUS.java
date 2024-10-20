package SESI_2;
import java.util.Scanner;

public class KUBUS {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Panjang Sisi : ");
        double sisi = scanner .nextDouble() ;

        double volume = sisi * sisi * sisi ;
        System.out.print("volume kubus : " + volume );

        scanner.close(); 
    }
}
