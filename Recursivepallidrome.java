public class Recursivepallidrome {
    public static void main(String[] args) {
        String letter="madam";
       boolean d= Pallidrome(letter);
       System.out.println(d);
        
    }
    public static boolean Pallidrome(String a)
    {
        if(a.length()<=1)
        {
            return true;
        }
        char first=a.charAt(0);
        char last=a.charAt(a.length()-1);
        if(first!=last)
        {
            return false;
        }
        String result= a.substring(1, a.length()-1);
        return Pallidrome(result);

    }
}
