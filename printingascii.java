
package everydaypractice;

public class printingascii {
    public static void main(String[] args){
        for(int i=1;i<=65;i++){
            System.out.println("ascii value of "+(char)i+" is "+i);
        }
        // ascii 0-32 control character
        // ascii 33-126 printable character
        // ascii 127-255 extended ascii character
    }
}
