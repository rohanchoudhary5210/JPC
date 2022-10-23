import java.util.*;
//  this program shows the sum of 2 numbers using functions
public class try_fun2{
    public static int sum(int a,int b){//formal parameter or parameter
        int s=a+b;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int s=sum(a,b);//actual  parameters/arguments
        System.out.println(s);
    }
}