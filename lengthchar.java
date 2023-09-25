import java.util.Scanner;
public class lengthchar {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String str = sc.nextLine();
        
        int alphabetcount=0;
        int specialcharactercount=0;
        int digitcount=0;
        String str2 = str.toLowerCase();

        for(int i=0; i<str.length(); i++)  {
          char ch = str2.charAt(i);
          if(ch>=97 && ch<=122) {
            alphabetcount++; 
          }  
          else if(ch>='0' && ch<='9') { 
            digitcount++;
          }
          else {
            specialcharactercount++;
          }

        }

        System.out.println("length of alphabets is:" + alphabetcount);
        System.out.println("length of digits is:" + digitcount);
        System.out.println("length of spclcharacter is:" + specialcharactercount);
    }
}