import java.util.Scanner;

public class Mul {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first value : ");
        int x = sc.nextInt();
        System.out.println("Enter your second value : ");
        int y = sc.nextInt();
        
        System.out.println("Result of two number multiple is : " + (x*y));
        sc.close();
    }
}
