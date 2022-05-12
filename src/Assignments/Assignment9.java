package Assignments;

public class Assignment9
{
    public static void main(String[] args)
    {
        String s = "Hey! How are you?.";
        System.out.println(check(s));
    }

    public static boolean check(String s)
    {
        return (s.matches("^[A-Z](.*)\\.$"));
    }
}
