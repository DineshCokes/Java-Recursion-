public class RecursiveGCD {
    public static void main(String[] args) {
        int a=16;
        int b=18;
        int result = GCD(a, b);
        System.out.println(result);        
    }
    public static int GCD(int num1,int num2)
    {
        if(num2==0)
        {
            return num1;
        }
        int remainder=num1%num2;
        return GCD(num2,remainder);
    }
  
}
