
package everydaypractice;


public class student {
    private int rollno;
    private String name;
    
    public student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getRoll(){
        return rollno;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setRoll(int rollno){
        this.rollno=rollno;
    }
}
