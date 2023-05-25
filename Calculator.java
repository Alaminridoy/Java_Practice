import java.util.Scanner;

public class Calculator {

    public static void sum(int x, int y) {
        System.out.println("The result is : " + (x + y));
    }

    public static void sub(int x, int y) {
        System.out.println("The result is : " + (x - y));
    }

    public static void mul(int x, int y) {
        System.out.println("The result is : " + (x * y));
    }

    public static void div(int x, int y) {
        System.out.println("The result is : " + (x / y));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int a = scn.nextInt();
        System.out.println("Enter your second number : ");
        int b = scn.nextInt();

        System.out.println("Choose your operation : \n1.Sum \n2.Subtraction \n3.Multiplication \n4.Division ");

        while (true) {
            int c = scn.nextInt();

            switch (c) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    sub(a, b);
                    break;

                case 3:
                    mul(a, b);
                    break;

                case 4:
                    div(a, b);
                    break;

                default:
                    System.out.println("Invalid Number");

            }
            System.out.print("Do you want to continue? (0/1): ");
            int w = scn.nextInt();
            if(w==0)
            {
                break;
            }

        }
        scn.close();
    }
    
}
