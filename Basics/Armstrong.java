// query:   You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.

// An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.

/*
Examples:
Input: n = 153
Output: true
Explanation: Number of digits : 3.
13 + 53 + 33 = 1 + 125 + 27 = 153.
Therefore, it is an Armstrong number.
*/


class Armstrong {
    public static boolean isArmstrong(int n) {
        int x =n;
        String s = Integer.toString(n);
        int l = s.length();
        double arm=0;
        boolean b = false;
       while(n!=0)
       {
         int a = n%10;
        arm = arm+Math.pow(a,l);
        n = n/10;
       }

       if(arm==x)
       {
            b = true;
       }
       return b;
    }

    public static void main(String args[])
    {
         int a = 183;
        boolean b = isArmstrong(a);
        System.out.println(b);
    }
}