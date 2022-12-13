
package everydaypractice;
import java.util.*;


public class Armstrong {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to check :");
        int val=sc.nextInt();
        int sum=0,r;
        int temp=val;
        int three=0;
        while(val>0){
            r=val%10;
            sum=sum+(r*r*r);
            val=val/10;
            
        }
        
        if(temp==sum){
            System.out.println("the entered value is armstrong number.");
        }
        else{
            System.out.println("entered value is not armstrong number.");
        }
    }
}
