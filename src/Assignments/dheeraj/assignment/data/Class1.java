package dheeraj.assignment.data;

public class Class1
{
    int a;
    char c;
    public void print()
    {
        System.out.println(a+" "+c);
    }
    public void printLocal()
    {
        int a;
        char c;
        //We must initialize the variables before we use them.
//        System.out.println(a+" "+c);
    }
}