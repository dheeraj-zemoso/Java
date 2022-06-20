package com.company;

public class Introduction
{
    public static void introduce()
    {
        System.out.println("Hello World!");
    }
    public static void introduce(String name)
    {
        System.out.println("Hello "+name+"!");
    }
    public static int addInts(int a, int b)
    {
        return a+b;
    }
    public static double addDoubles(double a, double b)
    {
        return a+b;
    }

    public boolean checkStringEquals(String a, String b)
    {
        return a.equals(b);
    }
    public boolean checkIntEquals(int a, int b)
    {
        return (a==b);
    }
    public static long getLCM(int a, int b)
    {
        for (int i=1; i<=a*b; i++)
        {
            if (i%a==0&&i%b==0)
            {
                return i;
            }
        }
        return a*b;
    }
    public static boolean IsDiv3(int n)
    {
        return (n%3==0);
    }
}
