import java.util.*;
public class cbv{
    public static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("reverse is "+a+" & "+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a, b);
        sc.close();
    }
}