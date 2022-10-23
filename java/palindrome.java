import java.util.*;
public class palindrome {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number- ");
        int n=sc.nextInt();
        sc.close();
        int r,k=n;
        int sum=0;
        while (n>0) {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if (sum==k) {
            System.out.println(" Yes It's a Palindrome Number ");
        }
        else{
            System.out.println(" No It's not a Palindrome Number ");
        }
    }
}
