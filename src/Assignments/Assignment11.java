package Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment11
{
    public static void main(String[] args) throws FileNotFoundException {
        String path = args[0];
        Map<Character, Integer> map = countFrom(path);
        putInFile("output", map);
    }

    public static Map<Character, Integer> countFrom(String name) throws FileNotFoundException {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(new FileReader(name));
        while(sc.hasNext())
        {
            String s = sc.nextLine();
            for(char c : s.toCharArray())
            {
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }
        return map;
    }

    public static void putInFile(String name, Map<Character, Integer> map) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File(name+".txt"));
        for (Map.Entry<Character, Integer> m : map.entrySet())
        {
            char c = m.getKey();
            int freq = m.getValue();
            pw.println(c+" = "+freq);
        }
        pw.close();
    }
}
