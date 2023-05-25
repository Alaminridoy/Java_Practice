import java.util.Scanner;

public class PyramidStarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your row Number : ");

        int r = 4; //sc.nextInt();
        int x=0;

        for(int i=0;i<r;i++){
            //space
            for(int j=0;j<r-1;j++){
                System.out.print(" ");
            }
            x=i*2-1;
            while(x != 0){
                System.out.print("*");
                x--;
            }
            x=0;
            System.out.println();
        }

        sc.close();
    }
}