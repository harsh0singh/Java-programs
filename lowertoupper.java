import java.util.Scanner;
public class lowertoupper {
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("write the string");
        String str = sc.nextLine();
        System.out.println("write the string");
        String str2 = sc.nextLine();
        String str3 = str2.toUpperCase();

        System.out.println( str3);
    }
}

