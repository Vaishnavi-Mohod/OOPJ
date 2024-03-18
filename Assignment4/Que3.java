/*Create a class Employee with multiple overloaded methods that have different parameter types (e.g., 
int, double, String). Demonstrate calling each overloaded method with appropriate arguments */
class Employee{
    public void Employee(String name,int id ){
        System.out.println("Name :" + name + " " + "ID : " + id);
    }
    public void Employee(String name,int id,double salary){
        System.out.println("Name :" + name + " " + "ID : " + id + " " + "Salary :" + salary);
    }


}
public class Que3 {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.Employee( "Vaishnavi", 2345);
        employee.Employee("Vaishnavi", 2345, 70000.456);




    }
}
