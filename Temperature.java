import java.util.Scanner;

public class Temperature {
    public static void celsius(int F) {
        int C = (5 / 9) * (F - 32);
        System.out.println("Celsius = " + C + "C");
    }

    public static void fahrenheit(int C) {
        int F = (9 / 5) * C + 32;
        System.out.println("Fehrenheit = " + F + "F");
    }

    public static void kelvin(int C) {

        double K = C + 273.15;
        System.out.println("kelvin = " + K + "K");
    }

    public static void main(String[] args) {
        // Celsius to Kelvin, K = C + 273.15.
        // Celsius to Fahrenheit, F = (9/5)C + 32.
        // Fahrenheit to Celsius, C = (5/9)(F-32)
        System.out.println("Enter your value : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("What you want to do?\n1.Celsius to Kelvin\n2.Celsius to Fahrenheit\n3.Fahrenheit to Celsius");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                kelvin(a);
                break;
            case 2:
                fahrenheit(a);
                break;
            case 3:
                celsius(a);
                break;
            default:
                System.out.println("Invalid Number");

        }
         sc.close();
    }
}