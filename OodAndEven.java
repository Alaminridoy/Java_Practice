import java.util.Scanner;

public class OodAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is Odd");
        }
        sc.close();
    }
}
