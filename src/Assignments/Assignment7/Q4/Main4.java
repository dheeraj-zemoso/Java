package Assignments.Assignment7.Q4;

public class Main4
{
    public static void main(String[] args) {

        AbstractFactory factory1 = FactoryMaker.getFactory("unicycle");
        AbstractFactory factory2 = FactoryMaker.getFactory("bicycle");
        AbstractFactory factory3 = FactoryMaker.getFactory("tricycle");

        Cycle cycle1 = factory1.getCycle();
        Cycle cycle2 = factory2.getCycle();
        Cycle cycle3 = factory3.getCycle();

        cycle1.printWheels();
        cycle2.printWheels();
        cycle3.printWheels();

    }

}
