package Assignments.Assignment7.Q4;

public class Main4
{
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Factory unicycleFactory = new Factory(unicycle);
        Factory bicycleFactory = new Factory(bicycle);
        Factory tricycleFactory = new Factory(tricycle);

    }

}
