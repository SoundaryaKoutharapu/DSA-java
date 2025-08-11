public class StringPalindrome {
    public static void main(String[] args) {
        // String s = "abba";
        // String s = "Abcdabcd";
        //    String s = "A man, a plan, a canal: Panama"; 
            String s = "0P";
           s = s.replaceAll("[^A-Za-z0-9]", "");
           s = s.toLowerCase();
           int n= s.length();
            System.out.println(s);
        boolean a = true;
        for(int i=0; i<s.length()/2; i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                a = false;
                break;
            }
    }
    if(a)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");

        }
}
