import java.util.*;
public class breakpatt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number or code to break");
        int n=sc.nextInt();
           sc.close();
           for (int i = 1; i<=1000000; i++) {
            System.out.println(i);
            if (i==n) {
                break;                
            }
        }
    System.out.println("Now I am out of loop");
    }
}
