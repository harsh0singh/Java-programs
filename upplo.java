import java.util.Scanner;
public class upplo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the character");
        char s1=sc.next().charAt(0);
        if(s1>='a' && s1<='z') 
            System.out.println("char is lowercase");
        else if(s1>='A' && s1<='Z')   
            System.out.println("char is upper case"); 
        else
            System.out.println("it is not alphabet");


    }
}

