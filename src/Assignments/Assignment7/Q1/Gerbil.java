package Assignments.Assignment7.Q1;

public class Gerbil extends Rodent
{
    Gerbil()
    {
        System.out.println("Gerbil is medium size");
    }

    @Override
    public void eat()
    {
        System.out.println("Gerbil eats faster");
    }

    @Override
    public void hunt()
    {
        System.out.println("Gerbil hunts faster");
    }
}
