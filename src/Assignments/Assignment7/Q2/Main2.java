package Assignments.Assignment7.Q2;

import java.util.ArrayList;

public class Main2
{
    public static void main(String[] args)
    {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        ArrayList<Cycle> cycles = new ArrayList<>();
        cycles.add(unicycle);
        cycles.add(bicycle);
//        cycles.add(tricycle);

//        for (Cycle cycle : cycles)
//        {
//            cycle.balance();
//        }

        unicycle.balance();
        bicycle.balance();
    }
}
