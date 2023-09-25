import java.util.Scanner;
public class negativearray {
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int num= sc.nextInt();
        int arr[]= new int[num];

        System.out.println("Entered array is:");
        for(i=0;i<num;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("negative elements of array is :");
        for(i=0;i<num;i++) {
            if(arr[i]<0) {
                System.out.println(arr[i]);
            }
        }
    }
}
