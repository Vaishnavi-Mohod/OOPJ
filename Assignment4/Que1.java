// Build a class Student which contains details about the Student and compile and run its instance.
import java.util.*;
class Student{

    private String name;
    private int rollno;
    private int marks;

    public void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        this.name = sc.nextLine();
        System.out.print("Rollno : ");
        this.rollno = sc.nextInt();
        System.out.print("Marks : ");
        this.marks = sc.nextInt();

    }
    public void  printRecord(){
        System.out.println(this.name+" "+this.rollno+" "+this.marks);
    }

    

}

public class Que1{
    public static void main(String[] args){
        Student student = new Student();

        student.acceptRecord( );

        student.printRecord( );



    }

}

