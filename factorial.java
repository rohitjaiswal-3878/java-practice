package everydaypractice;

import java.util.Scanner;

public class factorial {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number to find factorial :");
       int val=sc.nextInt();
       int fact=1;
       for(int i=1;i<=val;i++){
           fact=fact*i;
       }
       System.out.println("factorial is :"+fact);
   } 
}
