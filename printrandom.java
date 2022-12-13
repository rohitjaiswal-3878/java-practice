
package everydaypractice;


public class printrandom {
    public static void main(String[] args){
        int max=1000;
        int min=1;
        int a=(int)(Math.random()*(max-min+1)+min);
        System.out.println(a);
    }
}
