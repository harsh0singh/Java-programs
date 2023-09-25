import java.util.Scanner;
public class arrayaddition {
    public static void main(String args[])
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int numbers[]= new int[n];

        for(int i=0; i<n; i++) {
            numbers[i]=sc.nextInt();
            sum=sum+numbers[i];
        }
        
        for(int i=0;i<n;i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(sum);
    }
}
