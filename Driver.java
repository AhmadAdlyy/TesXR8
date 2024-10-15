package Bukuneh;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner nyam = new Scanner(System.in);
        System.out.println("Bukunya Textbook atau Novel? ");
        String kondisi_satu = nyam.next();
        
        System.out.println("Judul buku apa? ");
        String nama = nyam.next();
        System.out.println("Harga buku? ");
        double harga = nyam.nextDouble();
        System.out.println("Tahun buku? ");
        int tahun = nyam.nextInt();

        Book satu = new Book(nama, tahun, harga);
        satu.uraikan();



        if (kondisi_satu.equalsIgnoreCase("Textbook")) {
            System.out.println("Subject apa? ");
            String subject = nyam.next();
            Novel satu_text = new Novel(nama,tahun, harga, subject);
            satu_text.uraikan();
            System.out.println("Apakah termasuk Bio");
            String kondisi_dua = nyam.next();
            if (kondisi_dua.equals("iya")) {
                System.out.println("Bio tentang apa? ");
                String tentang = nyam.next();
                Biography satu_bio = new Biography(tentang,subject, nama, tahun, harga);
                satu_bio.uraikan();
            }
        } else if (kondisi_satu.equalsIgnoreCase("Novel")) {
            System.out.println("Genrenya apa? ");
            String genre = nyam.next();
            Novel satu_novel = new Novel(nama,tahun, harga, genre);
            satu_novel.uraikan();

        }

    }
}
    
    

