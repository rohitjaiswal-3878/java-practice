
package everydaypractice;
import java.util.*;

public class primenumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number to check it is prime or not :");
        int nu=sc.nextInt();
        int flag=0;
        if(nu==0||nu==1){
            System.out.print("number is not prime.");
        }
        else{
            for(int i=2;i<nu;i++){
                if(nu%i==0){
                    System.out.println("the number is not prime.");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
            System.out.print("the number is prime.");
        }
        }
        
    }
}
