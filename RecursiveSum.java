public class RecursiveSum {
    public static void main(String[] args) {
        int result=Sum(7);
        System.out.println(result);

    }
    public static int Sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
            return n+Sum(n-1);
        }


    }
}
