import java.util.Random;

public class DieSimulators
{
    public static void main(String[] args)
    {
        Random random1=new Random();
        int num=random1.nextInt(6);
        num++;
        System.out.println(num);
    }
}