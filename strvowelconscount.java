import java.util.Scanner;
public class strvowelconscount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int vowelCount=0;
        int consonentCount=0;
        str = str.toLowerCase();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z') {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    vowelCount++;
                }
                else {
                    consonentCount++;
                }
            }
        }
        System.out.println("vowel is:" + vowelCount);
        System.out.println("consonent is:" + consonentCount);

    }
}
