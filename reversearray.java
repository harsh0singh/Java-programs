import java.util.Scanner;
public class reversearray {
    public static void main(String args[])
    {
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int numbers[]= new int[n];
        int rev[]= new int[n];

        System.out.println("Enter the array which you want to reverse:");
        for(int i=0; i<n; i++) {
            numbers[i]=sc.nextInt();
        }
        System.out.println("Reverse of an array is:");
        for(int i=n;i>0;i--,j++) {
            rev[j] = numbers[i-1];
            System.out.println(rev[j]);
        }
    }
}