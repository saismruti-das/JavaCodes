//fibonnacci series:
import java.util.Scanner;
public class Fibonnacci{
    static int n1=0,n2=1,n3;
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter number :");
            int n=sc.nextInt();
            System.out.print("0 1 ");
            printFib(n);
        }
    }
    
    static void printFib(int n){
        if(n==0){
            return;
        }
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print(n3+" ");
        printFib(n-1);
    }
}
