
package everydaypractice;

import java.util.Scanner;


public class Everydaypractice {

    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int f=0,s=1;
        int t=0;
        System.out.println(f);
        System.out.println(s);
        for(int i=2;i<len;i++){
            t=s+f;
            f=s;
            s=t;
            System.out.println(t);
        }
        
    }
    
}
