public class Student {
    //instance variables
    int rollno;
    String name;
    String branch;
    //static variable
    static String collegeName = "AVN";
    //method 
    void print(){
        //local variable
        String msg = "These are TNS students";
        System.out.println(msg);
        System.out.println("The student details are " +rollno+" "+name+" "+branch+" "+" "+collegeName);
    }
    
}
