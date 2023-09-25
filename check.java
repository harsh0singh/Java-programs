import java.util.Scanner;
public class check {
    public static void main( String args[]) {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the first number");
       int num1=sc.nextInt();

       Scanner sc1=new Scanner(System.in);
       System.out.println("enter the second number");
       int num2=sc1.nextInt();

       if(num1>num2){
        System.out.println("first number is maximum");
       }
      else if(num2>num1) {
        System.out.println("second number is maximum");
       }
       else
        System.out.println("both are equal");
    
    }
}
