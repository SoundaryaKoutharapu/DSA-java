public  class SumOfN
{
        public static void sumofN(int n, int start, int sum)
        {
             if(start>n)
             {
                return;
             }
             sum=sum+start;
             System.out.println(sum);
             sumofN(n,start+1, sum);
        }

    public static void main(String args[])
    {
            int n=33;
            int start=1;
            int sum=0;
            sumofN(n,start, sum);
    }
}