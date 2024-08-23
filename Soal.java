import java.util.Scanner;

public class Soal {
    public static void main(String[] args){
       double Hargabarang,Diskon,Jumlahbarang;
       Scanner Input = new Scanner(System.in);
       double hasil_akhir;

       
       System.out.println("Masukkan Harga barang ");
       Hargabarang = Input.nextDouble();
       System.out.println("Masukkan Jumlah barang");
       Jumlahbarang = Input.nextDouble();
       System.out.println("Masukkan Diskon");
       Diskon = Input.nextDouble();
       Double Totalharga;
       Totalharga= Hargabarang * Jumlahbarang;
       Diskon = Diskon / 100 * Totalharga;
       hasil_akhir = Totalharga - Diskon;
       System.out.println("Total harganya adalah"+hasil_akhir);
       

    }
    
}
