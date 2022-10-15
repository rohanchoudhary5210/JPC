import java.util.*;
public class product{
    public  static int product(int a,int b)
    {
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=product(a,b);
        System.out.println("The product of "+a+" & "+b+" is "+ans);
        sc.close();
    }
}