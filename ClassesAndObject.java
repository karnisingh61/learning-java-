 
//class defination 
class Pen{
    String name;
    String type;   // eg:- ballpen or gell

    //methods
public void write(){
    System.out.println("write somthing");
}
public void displayinfo(){
    System.out.println(this.name);
    System.out.println(this.type);
}
}
public class ClassesAndObject {
    //main method 
    public static void main(String[] args) {
        //creating objects 
       Pen p1  = new Pen();
       p1.name = "cello";
       p1.type = "gell";
       p1.write();
       p1.displayinfo();
    }
}