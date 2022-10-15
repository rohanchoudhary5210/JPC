import java.util.*;
public class while_first_n_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        sc.close();
        int i=1,sum=0;
        while (i<=n) {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}