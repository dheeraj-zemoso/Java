package Assignments.Assignment8;

public class Main
{
    public static void main(String[] args) throws Exception1, Exception2, Exception3
    {
        makeException(1);
        makeException(2);
        makeException(10);
    }

    public static void makeException(int x) throws Exception1, Exception2, Exception3
    {
        try
        {
            if (x==1)
            {
                throw new Exception1("E1 thrown");
            }
            else if (x==2)
            {
                throw new Exception2("E2 thrown");
            }
            else if (x==3)
            {
                throw new Exception3("E3 thrown");
            }
            else {
                throw new NullPointerException();
            }
        }
        catch (Exception1 | Exception2 | Exception3 e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("We are in finally block");
        }
    }
}
