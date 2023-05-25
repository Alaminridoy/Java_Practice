import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner years = new Scanner(System.in);
        System.out.print("Please,Enter a year : ");
        int y = years.nextInt();

        if (y % 4 == 0) {
            System.out.println(+y + " is a leap year");
        } else if (y % 100 != 0 && y % 400 == 0) {
            System.out.println(+y + " is a leap year");
        } else {
            System.out.println(+y + " is not a leap year");
        }

        years.close();
    }
}