import java.util.*;
public class ent_num_till_mull_of_ten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int flag=1;
        do{
            System.out.print("Enter a number: ");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
        }while (flag==1) ;
        System.out.println("LOOP TERMINATED");
           sc.close();
    }
}
