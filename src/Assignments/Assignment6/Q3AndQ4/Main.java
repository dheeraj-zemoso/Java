package Assignments.Assignment6.Q3AndQ4;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //Q3
        ArrayList<Class1> objects = new ArrayList<>();
        objects.add(new Class1("Hey"));
        objects.add(new Class1("How are you?"));
        objects.add(new Class1("Bye"));


        //Q4
        Class1 obj1 = new Class1("Hello");
        Class1 obj2 = new Class1("I am fine");
        Class1 obj3 = new Class1("See you later");

        objects.add(obj1);
        objects.add(obj2);
        objects.add(obj3);
    }
}
