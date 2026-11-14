
import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu Celsius : ");
        double celsius = input.nextDouble();

        // Menghitung konversi suhu
        double fahrenheit = (9.0 / 5.0 * celsius) + 32;
        double reamur = (4.0 / 5.0) * celsius;
        double kelvin = celsius + 273.15;

        // Menampilkan hasil konversi
        System.out.println("\nHasil Konversi Suhu");
        System.out.println("-------------------------");
        System.out.println("Celsius    = " + celsius);
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("Reamur     = " + reamur);
        System.out.println("Kelvin     = " + kelvin);

        input.close();
    }
}
