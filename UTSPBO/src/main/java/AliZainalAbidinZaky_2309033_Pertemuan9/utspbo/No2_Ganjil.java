package AliZainalAbidinZaky_2309033_Pertemuan9.utspbo;
import java.util.Scanner;

public class No2_Ganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positif = 0;
        int negatif = 0;
        int total = 0;
        int jumlahBilangan = 0;
        
        System.out.print("Masukan bilangan integer, program akan berhenti jika memasukan nilai 0: ");

        while (true) {
            int angka = input.nextInt();
            if (angka == 0) {
                break;
            }

            if (angka > 0) {
                positif++;
            } else {
                negatif++;
            }

            total += angka;
            jumlahBilangan++;
        }
        if (jumlahBilangan == 0) {
            System.out.println("Tidak ada bilangan yang dimasukkan selain nol.");
        } else {
            double rataRata = (double) total / jumlahBilangan;

            System.out.println("Jumlah bilangan positif adalah " + positif);
            System.out.println("Jumlah bilangan negatif adalah " + negatif);
            System.out.println("Nilai total adalah " + (double) total);
            System.out.println("Nilai rata - rata " + rataRata);
        }
    }    
} 