import java.util.Scanner;
public class concat {
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("write the string");
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = str.concat(str2);

        System.out.println( str3);
    }
}
