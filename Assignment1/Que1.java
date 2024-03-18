import java.util.*;
class Que1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks:");
        int n=sc.nextInt();

        if(n>=80){
            System.out.println("Grade A");
        }
        else if((n>=65) && (n<80)){
            System.out.println("Grade B");
        }
        else if((n>=45) && (n<65)){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }

    }
}