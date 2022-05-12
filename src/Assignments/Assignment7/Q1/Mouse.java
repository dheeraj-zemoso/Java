package Assignments.Assignment7.Q1;

public class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("Mouse is Small in size");
    }

    @Override
    public void eat()
    {
        System.out.println("Mouse eats slowly");
    }

    @Override
    public void hunt()
    {
        System.out.println("Mouse hunts rarely");
    }
}
