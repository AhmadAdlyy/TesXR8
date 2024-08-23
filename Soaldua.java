import java.util.Scanner;

public class Soaldua {
    public static void main(String[] args){
        int jamkerja;
        int tarifperjam;
        double bruto;
        double netto;
        double pembagi = 10;
        double hasil_akhir;
        Scanner scan = new Scanner(System.in);



        System.out.println("Berapa Lama jam kerjanya: ");
        jamkerja =scan.nextInt();
        System.out.println("Berapa tarif per jam kerjanya: ");
        tarifperjam = scan.nextInt();
        bruto = jamkerja*tarifperjam;
        System.out.println("Brutomu adalah"+bruto);
        pembagi = pembagi / 10;
        netto = bruto*pembagi;
        System.out.println("Nettomu adalah"+netto);
        hasil_akhir = bruto-netto;
        System.out.println("hasil akhir adalah"+hasil_akhir);
    }
    
}
