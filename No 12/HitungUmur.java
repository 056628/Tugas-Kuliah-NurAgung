import java.util.Scanner;

public class HitungUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int tahun = input.nextInt();
        int umur = 2020- tahun;
        System.out.println( "Umur anda " + umur + " tahun");

    }
}