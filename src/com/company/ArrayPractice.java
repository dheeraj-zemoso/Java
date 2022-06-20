package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice
{
    public static void arrayDemo()
    {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(Arrays.toString(arr));
    }
    public static void listDemo()
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i<=10; i++)
        {
            list.add(i);
        }
        System.out.println(list);
    }

    public static ArrayList<Integer> getListUntilAndIsWhole(int n, boolean Whole)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (Whole)
        {
            list.add(0);
        }
        for (int i=1; i<=n; i++)
        {
            list.add(i);
        }
        return list;
    }
    public static Integer getWrapped(int a)
    {
        return (Integer)a;
    }
}
