
import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah detik: ");
        int totalDetik = input.nextInt();

        // Menghitung jam
        int jam = totalDetik / 3600;

        // Menghitung sisa menit
        int menit = (totalDetik % 3600) / 60;

        // Menghitung sisa detik
        int detik = totalDetik % 60;

        // Menampilkan hasil
        System.out.println("\nHasil Konversi Waktu");
        System.out.println("-------------------------");
        System.out.println("Jam   : " + jam);
        System.out.println("Menit : " + menit);
        System.out.println("Detik : " + detik);

        input.close();
    }
}

