public class RecursiveExponential {
    public static void main(String[] args) {
        double a=3.5;
        int b=4;
        double result=Exponential(a,b);
        System.out.println(result);
    }
    public static double Exponential(double base,int power)
    {
        if(power==0)
        {
            return 1;
        }
        return base * Exponential(base, power-1);

    }
}
