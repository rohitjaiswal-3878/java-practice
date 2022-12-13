
package everydaypractice;

import java.util.Scanner;


public class palindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number to check palindrome :");
        int val=sc.nextInt();
        int r,sum=0,temp;
        temp=val;
        while(val>0){
            r=val%10;
            sum=(sum*10)+r;
            val=val/10;
        }
        if(temp==sum){
            System.out.print("palindrome.");
        }
        else{
            System.out.print("not palindrome.");
        }
    }
}
