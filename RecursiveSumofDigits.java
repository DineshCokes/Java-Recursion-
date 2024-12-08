public class RecursiveSumofDigits {
    public static void main(String[] args) {
        int result = SumDigit(123456);
        System.out.println(result);
    }
    public static int SumDigit(int a)
    {
        if(a<10)
        {
            return a;
        }
        int last_digit =a%10;
        int remaining_number=a/10;
        return last_digit + SumDigit(remaining_number);

    }
}
