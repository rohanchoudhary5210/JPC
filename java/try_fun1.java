package java;
import java.util.*;
public class try_fun1{
    public static void sum(int a,int b){
        int s=a+b;
        System.out.println(s);
      
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