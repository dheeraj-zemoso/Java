package Assignments.Assignment7.Q4;

public class BicycleFactory extends AbstractFactory
{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
