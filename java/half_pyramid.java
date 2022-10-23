import java.util.*;
public class half_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N:");
        int N=sc.nextInt();
        sc.close();
        for (int i = 1; i <=N; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}