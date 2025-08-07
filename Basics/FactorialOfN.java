public class FactorialOfN {

public static int factorial(int n)
{
    if(n==0 || n==1)
    {
        return n;
    }

    int fact = n*factorial(n-1);
    System.out.println(fact);
    return fact;

}
    public static void main(String[] args) {
        int n=6;
        int fact = 1;
        factorial(n);
    }
}
