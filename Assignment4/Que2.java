/*Write a Vehicle class with overloaded methods that have a different number of parameters. 
Demonstrate calling these overloaded methods with various numbers of arguments.*/
import java.util.*;
class Vehical{
    public void Vehical(String type, int id){
        System.out.println("Type :" + type + " " + "ID : " + id);
    }

    public void Vehical(int id, String type){
        System.out.println("ID : " + id + " " + "Type :" + type);
    }


}

public class Que2 {
    public static void main(String[] args){
        Vehical vehical = new Vehical();

        vehical.Vehical("car", 3456);
        vehical.Vehical(678,"bike");
    }
    
}
