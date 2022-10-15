import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check ");
        int n=sc.nextInt();
        sc.close();
        int c=0;
        for (int i = 1; i<=n; i++) {
            if (n%i==0) {
                c++;                
            }
        }
            if(c==2)
            {
                System.out.println("Number is a prime number");
            }
            else if(c==1){
                System.out.println("Number is neither a prime number nor a composite number");
            }
            else{
                System.out.println("Number is not a prime number but a a composite number");
            }
    }
}