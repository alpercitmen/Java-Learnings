import java.util.Objects;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner imp = new Scanner(System.in);
        // değişken tanımları
        int mat, fiz, kim, tur, tarih, muzik, ort;

        System.out.print("Matematik notunuzu girin: ");
        mat = imp.nextInt();
        System.out.print("Fizik notunuzu girin: ");
        fiz = imp.nextInt();
        System.out.print("Kimya notunuzu girin: ");
        kim = imp.nextInt();
        System.out.print("Türkçe notunuzu girin: ");
        tur = imp.nextInt();
        System.out.print("Tarih notunuzu girin: ");
        tarih = imp.nextInt();
        System.out.print("Müzik notunuzu girin: ");
        muzik = imp.nextInt();

        ort = (mat + fiz + kim + tur + tarih + muzik) / 6;
        int signum = Long.signum((long)ort - 60);
        switch (signum){
            case -1: // ortalam 60'tan küçükse
                System.out.println("Sınıfta Kaldı: " + ort);
                break;
            case 0: // ortalam 60 ise
                System.out.println("Ortalama: " + ort);
                break;
            case 1: // ortalam 60'tan büyükse
                System.out.println("Sınıfı Geçti: " + ort);
                break;
            default:
                break;
        }
    }
}
