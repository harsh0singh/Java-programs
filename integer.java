import java.util.*;
public class integer {
public static void main( String args[]) {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the first number");
       int num1=sc.nextInt();
    
       if(num1>0) {
        System.out.println("number is positive");

       }
       else if(num1<0) {
        System.out.println("Number is negative");
       }
       else {
        System.out.println("Number is zero");
       }      
       
    }
    
}
