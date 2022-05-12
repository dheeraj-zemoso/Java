package Assignments.Assignment7.Q1;

public class Hamster extends Rodent
{
    Hamster()
    {
        System.out.println("Hamster is bigger in size");
    }

    @Override
    public void eat()
    {
        System.out.println("Hamster eats fastest");
    }
    @Override
    public void hunt()
    {
        System.out.println("Hamster hunts fastest");
    }
}
