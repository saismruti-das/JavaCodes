import java.util.*;
public class MaxOfThreeNumber{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();
        System.out.println("Enter c:");
        c=sc.nextInt();
        System.out.println("Greatest of the 3 is:"+(a>b?a>c?a:c:b>c?b:c));
    }
}
