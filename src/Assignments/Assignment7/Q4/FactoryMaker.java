package Assignments.Assignment7.Q4;

public class FactoryMaker
{
    public static AbstractFactory getFactory(String type)
    {
        if(type.equalsIgnoreCase("Unicycle"))
        {
            return new UnicycleFactory();
        }
        else if (type.equalsIgnoreCase("Bicycle"))
        {
            return new BicycleFactory();
        }
        else if (type.equalsIgnoreCase("Tricycle"))
        {
            return new TricycleFactory();
        }
        else
        {
            return null;
        }
    }
}
