package Assignments.Assignment7.Q4;

public class TricycleFactory extends AbstractFactory
{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
