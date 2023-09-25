public class Compoundinterest {
    public static void main(String args[])
    {
        double principal = 6000;
        double rate =1.0;
        int n =12;
        int years =10;
        double amount = principal*Math.pow(1+(rate/n),n*years);
        double compoundInterest = amount - principal;
        System.out.println("the compound interest is:"+ compoundInterest);
            }
    
}
