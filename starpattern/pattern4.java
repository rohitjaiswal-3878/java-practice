
package starpattern;

public class pattern4 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            for(int m=0;m<i;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i+1;j++){
                System.out.print(" ");
            }
            for(int k=n-1;k>i;k--){
                System.out.print("*");
            }
            for(int m=n-2;m>i;m--){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *
