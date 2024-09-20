import java.util.Scanner;

public class TugasSatu {
    public static void main(String[] args) {
        int bilangan_awal=6;
        int bilangan_akhir=6;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan awal");
        bilangan_awal = input.nextInt();
        System.out.println("Masukkan  ilangan akhir");
        bilangan_akhir = input.nextInt();
        System.out.println("___________________");
        while (bilangan_awal<=bilangan_akhir){
            System.out.println(bilangan_awal+",");
            bilangan_awal+=6;
        }

        
    }
    
}
