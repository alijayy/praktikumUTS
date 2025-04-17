package AliZainalAbidinZaky_2309033_Pertemuan9.utspbo;
import java.util.Scanner;

/**
 *
 * @author Ali Zaky
 */
public class No3_Ganjil {
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10; // ambil digit terakhir
            n /= 10;       // buang digit terakhir
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int angka = input.nextInt();

        int jumlahDigit = sumDigits(angka);

        System.out.println("Jumlah semua digit adalah: " + jumlahDigit);
    }
    
}
