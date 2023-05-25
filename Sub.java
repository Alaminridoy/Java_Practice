import java.util.Scanner;

public class Sub {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first value : ");
        int x = sc.nextInt();
        System.out.println("Enter your second value : ");
        int y = sc.nextInt();
        
        System.out.println("Result of two number sub is : " + (x-y));
        sc.close();
    }
}
