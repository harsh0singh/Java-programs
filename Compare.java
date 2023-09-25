import java.util.Scanner;
public class Compare {
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("write the first string");
        String str = sc.nextLine();
        System.out.println("write the second string");
        String str2 = sc.nextLine();
        System.out.println("write the third string");
        String str3 = sc.nextLine();
        System.out.println(str.compareTo(str2));
        System.out.println(str.compareTo(str3));
    }
}
