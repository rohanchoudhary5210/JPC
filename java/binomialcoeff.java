import java.util.*;

public class binomialcoeff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the value of n");
        double n=sc.nextDouble();
        System.out.println(" Enter the value of r");
        double r=sc.nextDouble();    
        double ans=binomial_coefficient(n,r);
        System.out.println(" nCr is "+ans);
        sc.close();
    }

    public static int factorial(double n) {
        int f=1;
         for(int i=1;i<=n;i++){
             f=f*i;
         }
         return f;
    }

    public static double binomial_coefficient(double n, double r) {
    int n_coeff=factorial(n);
    int r_coeff=factorial(r);
    int diff=(int) (n-r);
    int diff_coeff=factorial(diff);
    double nCr=(n_coeff)/((r_coeff)*(diff_coeff));
    return nCr;
    }
}



    

