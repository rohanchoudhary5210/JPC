
import java.util.*;
public class for_first_n_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        sc.close();
        int sum=0;
        for (int i = 1; i<=n; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}