package Assignments.Assignment7.Q4;

public class UnicycleFactory extends AbstractFactory
{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
