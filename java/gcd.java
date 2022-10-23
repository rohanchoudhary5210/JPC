
import java.util.*;
public class  gcd{
    /* The greatest common divisor (GCD) of two or more numbers is the greatest common factor number that divides them, exactly. It is also called the highest common factor */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        do{
        System.out.print("Enter First Number: ");
        int n1=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2=sc.nextInt();
        int a=Math.min(n1, n2);
        int b=Math.max(n1, n2);
        int k,check=0;
        if(b%a==0){
            System.out.println("GCD is "+a);
        }    
        else{
            for(int i=1;i<=b;i++){
                if(b%i==0 && a%i==0){
                    k=i;
                    if(check<k){
                        check=k;
                    }
                }
            }
            System.out.println("GCD is "+check);
        }
            System.out.println();
          System.out.print("Enter 1 to continue: ");
          n=sc.nextInt();
          if(n==1){
            System.out.println("Redirecting again.....................");
            System.out.println();
          }
          else{
            System.out.println(".........................");
            System.out.println("..............Exit done.");
          }
    }while(n==1);
    sc.close();
        }
        
    }