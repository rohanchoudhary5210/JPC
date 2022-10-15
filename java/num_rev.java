package java;
import java.util.*;
public class num_rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num to reverse: ");
        int n=sc.nextInt();
        sc.close();
        int rev=0;
                while (n>0) {
                    int k=n%10;
                    rev=rev*10+k;
                    n=n/10;
                }
        System.out.println(rev);
    }
}