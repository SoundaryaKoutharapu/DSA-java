public class FibonicciSeries
{
    public static int fibinocci(int n)
    {
        if(n==1 | n==0)
        {
            return n;
        }

        return fibinocci(n-1)+fibinocci(n-2);
    }

    public static void main(String[] args) {
        int n=9;

      int sum = fibinocci(n);
      System.out.println(sum);

    }
}