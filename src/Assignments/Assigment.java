package Assignments;

import java.util.HashSet;

class Assignment
{
    public static void main(String args[])
    {
        String s = "abBCDEDFGHIJKLMNOPqRSTUVWXYZ";
        System.out.println(betterCheck(s));
    }
    private static boolean check(String s)
    {
        for (int i=0; i<26; i++)
        {
            char c = (char)('a'+i);
            char C = (char)('A'+i);
            int len = s.length();
            boolean foundLowerCase = false;
            boolean foundUpperCase = false;
            for (int k=0; k<len; k++)
            {
                char x = s.charAt(k);
                if (x==c)
                {
                    foundLowerCase = true;
                }
                if (x==C)
                {
                    foundUpperCase = true;
                }
            }
            if (!foundLowerCase&&!foundUpperCase)
            {
                return false;
            }
        }
        return true;
    }
    private static boolean betterCheck(String s)
    {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray())
        {
            char lower = Character.toLowerCase(c);
            set.add(lower);
        }
        for (int i=0; i<26; i++)
        {
            char c = (char)(i+'a');
            if (set.contains(c)==false)
            {
                return false;
            }
        }
        return true;
    }
}
