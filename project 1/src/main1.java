public class main1 {
    public static void throwexample(int a,int b)
    {
        int c=a-b;
        if(c<0)
        {
            throw new RuntimeException("Number is negative");
        }

    }
    public static void main(String[] args)
    {
        int a=5;
        int b=1;
        throwexample(a,b);
        System.out.println("remaining code");
    }

}
