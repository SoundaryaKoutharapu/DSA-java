class OneToNRecursion {
    public static void printNumbers(int n, int start) {
        if(start>n)
        {
            return;
        }
        
            printNumbers(n, start+1);
            System.out.println(start);
    }

    public static void main(String[] args) {
        int n=10;
        int start = 1;
        printNumbers(n, start);
    }
}