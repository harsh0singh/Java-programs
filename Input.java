import java.util.Scanner;
 
public class Input{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = in.nextLine();
        System.out.println("You entered string " + s);
        System.out.println("Enter the integer");
        int a = in.nextInt();
        System.out.println("You entered integer " + a);
        System.out.println("Enter the float");
        float b = in.nextFloat();
        System.out.println("You entered float " + b);
    }
}