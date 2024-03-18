import java.util.*;
public class Que6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight in kilogram:");
        double weight = sc.nextDouble();

        System.out.println("Enter Height in meter");
        double height = sc.nextDouble();
        double BMI = weight/(height*height);
        System.out.println("BMI is :" + BMI);

        if(BMI<=17){
            System.out.println("Underweight");

        }
        else if((BMI>18.25) && (BMI<=25)){
            System.out.println("Normal");

        }
        else{
            System.out.println("overweight");

        }

    }
    
}
