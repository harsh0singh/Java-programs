public class checkage {
    static void checkAge(int age)
    {
        if(age<18) {
            System.out.println("Access Denied- you are not enough age");
        }
        else {
            System.out.println("Access granted");
        }
    }
    public static void main(String args[])
    {
        checkAge(18);
    }
}
