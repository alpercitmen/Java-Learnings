import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        String operator;
        System.out.println("Hello and welcome!");
        System.out.print("İlk sayıyı girin: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        b = input.nextInt();
        System.out.print("Yapılacak işlemi girin: (+, -, *, /) ");
        operator = input.nextLine();
        if (operator.contains("+") || operator.contains("-") || operator.contains("*") || operator.contains("/")) {
            System.out.println(calculate(a,b,operator));
        }else {
            System.out.println("Geçersiz işlem girdiniz!");
        }
    }

    private static int calculate(int a, int b, String operator) {
        if (Objects.equals(operator, "+")) {
            return a + b;
        }
        else if (Objects.equals(operator, "-")) {
            return a - b;
        }else if (Objects.equals(operator, "*")) {
            return a * b;
        }else if (Objects.equals(operator, "/")) {
            return a * b;
        }else
            return 0;
    }

}