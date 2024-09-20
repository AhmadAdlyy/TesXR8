import java.util.Scanner;

public class TugasDua {
    public static void main(String[] args){
        int jumlah_siswa;
        int nilai_siswa;
        int absensi_siswa;
        double totalsemua_nilai=0;
        double rata_rata_siswa;

        Scanner nice = new Scanner(System.in);
        System.out.println("jumlah siswa");
        jumlah_siswa=nice.nextInt();
        System.out.println("______________________");
        for(absensi_siswa=1; absensi_siswa<=jumlah_siswa;absensi_siswa++){
            System.out.println("Masukkan nilai siswa ke-"+ absensi_siswa+":");
            nilai_siswa = nice.nextInt();
            totalsemua_nilai += nilai_siswa;

        }
        System.out.println("____________________");
        rata_rata_siswa = totalsemua_nilai/jumlah_siswa;
        System.out.println("rata rata nilai dari"+jumlah_siswa+"siswa adalah:"+rata_rata_siswa);
    }
    
}
