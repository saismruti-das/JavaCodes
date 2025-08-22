import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();                      //can only take one token. i.e. if we enter "tony stack" it will only take tony as input.
        //nextLine() --> for taking whole line
        //nextInt() --> for integer type input
        //nextFloat() 
        System.out.println(name);
    }
}
