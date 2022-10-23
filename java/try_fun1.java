import java.util.*;
//  this program shows the sum of 2 numbers using functions

public class try_fun1{
    public static void sum(int a,int b){
        int s=a+b;
        System.out.println("sum of "+a+" & "+b+" is "+s);
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        sum(a,b);
    }
}