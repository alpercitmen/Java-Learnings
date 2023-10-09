import java.util.Scanner;
public class VatAmount {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);

        double tutar, kdvOrani;

        System.out.print("Ödenecek tutarı giriniz: ");
        tutar = imp.nextInt();

        if (tutar <= 1000 && tutar > 0) kdvOrani = 0.18;
        else if (tutar > 1000) kdvOrani = 0.8;
        else kdvOrani = 0.18;

        double kdvTutari = tutar * kdvOrani;
        double kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV'li Fiyat: " + kdvliTutar);
        System.out.println("KDV Oranı: " + kdvOrani);
    }
}
