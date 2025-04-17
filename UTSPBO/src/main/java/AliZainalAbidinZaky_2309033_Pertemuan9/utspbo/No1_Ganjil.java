package AliZainalAbidinZaky_2309033_Pertemuan9.utspbo;
import java.util.Random;

public class No1_Ganjil{
    public static void main(String[] args) {
        Random rand = new Random();
        
        int angkaAcak = rand.nextInt(12) + 1;
        
        switch (angkaAcak) {
            case 1 -> System.out.println("Januari") ;
            case 2 -> System.out.println("Februari");
            case 3 -> System.out.println("Maret");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("Mei");
            case 6 -> System.out.println("Juni");
            case 7 -> System.out.println("Juli");
            case 8 -> System.out.println("Agustus");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("Oktober");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("Desember");
            default -> {
            }
        }
    }
}
