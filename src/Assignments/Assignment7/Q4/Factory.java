package Assignments.Assignment7.Q4;

public class Factory
{
    Factory(Unicycle unicycle)
    {
        unicycle.printWheels();
        System.out.println("Factory is created for Unicycle");
    }

    Factory(Bicycle bicycle)
    {
        bicycle.printWheels();
        System.out.println("Factory is created for Bicycle");
    }

    Factory(Tricycle tricycle)
    {
        tricycle.printWheels();
        System.out.println("Factory is created for Tricycle");
    }
}
