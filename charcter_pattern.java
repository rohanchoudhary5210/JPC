import java.util.*;
public class charcter_pattern {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number: ");
            int n=sc.nextInt();
            sc.close();
            char ch='A';
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
    }
