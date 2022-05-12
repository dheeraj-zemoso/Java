package Assignments.Assignment6.Q1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Vampire
{
    static TreeMap<Integer, String> map = new TreeMap<>();
    public static void main(String[] args)
    {
        int count = 500;
        int c = 0;
        int i=10;
        while(c<count)
        {
            if (hasEvenDigs(i))
            {
                if (isVampire(i))
                {
                    c++;
                }
            }
            else
            {
                i = i*10;
            }
            i++;
        }
        int o = 1;
        for (Map.Entry<Integer, String> m : map.entrySet())
        {
            System.out.println(o+") "+m.getValue());
            o++;
        }
    }
    private static boolean hasEvenDigs(int n)
    {
        String s = Integer.toString(n);
        int len = s.length();
        return (len%2==0);
    }

    public static boolean isVampire(int n)
    {
        String num = Integer.toString(n);
        int len = num.length();
        String firstNum = num.substring(0,len/2);
        String secondNum = num.substring(len/2, len);
        int l = firstNum.length();
        int x1 = Integer.parseInt(firstNum);
        int x2 = Integer.parseInt(secondNum);
        int a = Math.min(x1,x2);
        int b = Math.max(x1,x2);
        int p = a*b;
        String prod = Integer.toString(p);
        if (arePermutes(num,prod)&&map.containsKey(p)==false)
        {
            String ans;
            if (firstNum.charAt(l-1)=='0'&&secondNum.charAt(l-1)=='0')
            {
                System.out.println(prod + " = " + a + "*" + b+"-----------------trailing zeros---------------------");
                return false;
            }
            else
            {
                ans = prod + " = " + a + "*" + b;
                map.put(p, ans);
                return true;
            }
        }
        else {
            return false;
        }
    }

    public static boolean arePermutes(String x, String y)
    {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : x.toCharArray())
        {
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for (char c : y.toCharArray())
        {
            map2.put(c, map2.getOrDefault(c,0)+1);
        }
        return map1.equals(map2);
    }
}
