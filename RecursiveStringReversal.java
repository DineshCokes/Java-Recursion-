public class RecursiveStringReversal {
    public static void main(String[] args) {
        String a="Iam";
        String result = ReverseString(a);
        System.out.println(result);
        
    }
    public static String ReverseString(String str)
    {
        if(str.length()<=1)
        {
            return str;
        }
        return str.substring(1)+str.charAt(0);

    }

    
}
