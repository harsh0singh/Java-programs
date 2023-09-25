import java.util.Scanner;
public class evensum {
    public static void main(String args[])
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int numbers[]= new int[n];

        for(int i=0; i<n; i++) {
            numbers[i]=sc.nextInt();
            if(numbers[i]%2==0){
                sum=sum+numbers[i];
            }
        }
        
        System.out.println(sum);
    }
}

