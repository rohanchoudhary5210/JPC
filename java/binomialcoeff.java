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

    public static double binomial_coefficient(double n, double r) {
    int n_coeff=factorail(n);
    int r_coeff=factorail(r);
    int diff=(int) (n-r);
    int diff_coeff=factorail(diff);
    double nCr=(n_coeff)/((r_coeff)*(diff_coeff));
    return nCr;
    }

    public static int factorail(double n) {
        int f=1;
         for(int i=1;i<=n;i++){
             f=f*i;
         }
         return f;
    }
}


    

