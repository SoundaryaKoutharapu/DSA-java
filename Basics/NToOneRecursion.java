public class NToOneRecursion
{
    public static void printNum(int n)
    {
        if(n==0)
        {
            return;
        }
            printNum(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        int n=20;
        printNum(n);
    }
}