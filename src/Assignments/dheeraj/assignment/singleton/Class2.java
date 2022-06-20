package dheeraj.assignment.singleton;

public class Class2 {
    String myString;

    public static Class2 get(String parameter) {
        //Cannot access non-static fields inside static methods.
//        myString = parameter;
        return new Class2();
    }

    public void print() {
        System.out.println(myString);
    }
}
