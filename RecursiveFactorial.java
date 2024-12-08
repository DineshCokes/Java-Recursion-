public class RecursiveFactorial {
 public static void main(String[] args) {
    int fact=Factorial(5);
    System.out.println("Factorial is "+fact);

    
 }

 public static int Factorial(int a)
 {
    if(a==0)
    {
        return 1;
    }
    else{
        return a * Factorial(a-1);
    }


 }
}