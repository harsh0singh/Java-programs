import java.util.Scanner;
public class vowelcon {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the character");
        char s2=sc.next().charAt(0);
        if(s2=='a' || s2=='A') {
            System.out.println("Alphabet");
        }
        else if(s2=='e' || s2=='E') {
            System.out.println("Alphabet");
        }
        else if(s2=='i' || s2=='I') {
            System.out.println("Alphabet");
        }
        else if(s2=='o' || s2=='O') {
            System.out.println("Alphabet");
        }
        else if(s2=='u' || s2=='U') {
            System.out.println("Alphabet");
        }
        else {
            System.out.println("consonant");
        }
    }
}
