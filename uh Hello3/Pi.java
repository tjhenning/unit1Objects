
public class Pi
{
    public static void main(String[] args)
    {
        int count=0;
        double value=4;
        double denom=1;
        while (count<1000)
        {
           denom+=2;
           value+=(-4/denom);
           count++;
           System.out.println(value);
           denom+=2;
           value+=(4/denom);
           count++;
           System.out.println(value);
        }
        System.out.println(value);
    }
}