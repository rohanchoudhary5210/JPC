import java.util.*;
public class half_character {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter N(65-90): ");
            int N=sc.nextInt();
            sc.close();
            for (int i = 65; i <=N; i++) {
                for(int j=65;j<=i;j++){
                    char ch=(char)j;
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }
