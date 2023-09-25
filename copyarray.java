import java.util.Scanner;
public class copyarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int numbers[]= new int[n];
        int numbers2[]= new int[n];

        for(int i=0; i<n; i++) {
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            numbers2[i]= numbers[i];
        }
        for(int i=0;i<n;i++) {
            System.out.println(numbers2[i]);
        }
    }
}