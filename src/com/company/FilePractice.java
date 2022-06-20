package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilePractice
{
    public static void makeFileWithText(String name, String text) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(name+".txt");
        pw.println(text);
        pw.close();
    }
    public static void readFileWithName(String name) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(name));
        while(sc.hasNext())
        {
            System.out.println(sc.nextLine());
        }
    }
    public static void calSumFromFile(String name) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(name));
        int sum = 0;
        while(sc.hasNext())
        {
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println("Sum is : "+sum);
    }
}
