package java;
import java.util.*;
public class fact{
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        int ans=factorial(a);
        System.out.println("The factorial of "+a+" is "+ans);
        sc.close();
    }
}