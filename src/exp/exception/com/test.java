package exp.exception.com;
interface test_int1
{
    int x=20;
}

public class test implements test_int1
{
    int x = 40;
    public static void main (String args[])
    {
        test t1 = new test();
        System.out.println(t1.x);
    }
}
