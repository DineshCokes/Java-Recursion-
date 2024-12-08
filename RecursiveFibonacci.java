public class RecursiveFibonacci {
    public static void main(String[] args) {
        int result=Fibonacci(9);
        System.out.println(result);
    }
    public static int Fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);

    }
}
