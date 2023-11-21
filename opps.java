class Pen{
    String color;
    String type;        //functions which are define in class called as methods

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);   // this tell which object is accesing 
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


//objects banate hai main function mai

public class opps {
    public static void main(String args[]){
        Pen pen1 = new Pen();  //object of pen class
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.write();  //to call object
        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;

        s1.printInfo();
    }
}
