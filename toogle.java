public class toogle {
    public static void main(String[] args) {
        String str="abANa";
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                ans+=(char)(str.charAt(i)-32);
            }
            else{
                ans+=(char)(str.charAt(i)+32);
            }
        }
        System.out.println(ans);
    }
}
