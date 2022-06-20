package com.company;

public class StringPractice
{
    public static String getStringUntil(int n)
    {
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=n; i++)
        {
            sb.append(i);
            sb.append("!");
        }
        String ans = sb.toString();
        return ans;
    }
    public static String getNumbersInStringSeparatedBy(int n, String s)
    {
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=n; i++)
        {
            sb.append(i);
            sb.append(s);
        }
        String ans = sb.toString();
        return ans;
    }
    public static void recurredPrintDecOrder(int a)
    {
        if (a==0)
        {
            return;
        }
        System.out.print(a+" ");
        recurredPrintDecOrder(a-1);
    }
    public static void recurredPrintAscOrder(int i, int n)
    {
        if (i>n)
        {
            return;
        }
        System.out.print(i+" ");
        recurredPrintAscOrder(i+1, n);
    }
}
