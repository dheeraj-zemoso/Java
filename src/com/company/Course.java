package com.company;
import com.company.FunctionalInterfaces.*;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Course
{
    public static void main(String args[])
    {
        LambdaPractice.fun(()->System.out.println("Hey"));
        Square sqLambda = (x)->(x*x);
        Arithmetic addLambda = (x,y)->(x+y);
        Arithmetic multiplyLambda = (x,y)-> (x*y);
        SayHello sayHello = ()->("How are you?");
        System.out.println(sqLambda.square(7));
        System.out.println(addLambda.calculate(2,9));
        System.out.println(multiplyLambda.calculate(7,9));
        System.out.println(sayHello.say());

        Predicate<Integer> checkEven = (a)-> (Number.isEven(a));

        Predicate<Integer> checkDiv3 = (a)->(Number.isDiv3(a));

        Predicate<Integer> checkEvenAndDiv3 = checkEven.and(checkDiv3);

        System.out.println(checkEven.test(12));

        System.out.println(checkDiv3.test(11));

        System.out.println(checkEvenAndDiv3.test(60));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);

        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);


        Stream<String> names = Stream.of("Ramesh", "Suresh", "Mahesh");
        long count = names.count();

        String cities[] = {"Hyderabad", "Delhi", "Mumbai", "HelloCity"};

        String cityNamesStartWithH[] = Arrays.stream(cities).filter((s)->(s.startsWith("H"))).collect(Collectors.toList()).toArray(String[]::new);

        System.out.println(Arrays.toString(cityNamesStartWithH));

    }

    public static void get() throws FileNotFoundException
    {
        Introduction.introduce();
        Introduction.introduce("Dheeraj");
        System.out.println(Introduction.getLCM(345,45));
        ArrayPractice.arrayDemo();
        ArrayPractice.listDemo();
        System.out.println(ArrayPractice.getWrapped(123));
        ArrayList<Integer> wholeNums = ArrayPractice.getListUntilAndIsWhole(12, true);
        System.out.println(wholeNums);
        ArrayList<Integer> naturalNums = ArrayPractice.getListUntilAndIsWhole(10, false);
        System.out.println(naturalNums);
        String s = StringPractice.getStringUntil(15);
        System.out.println(s);
        s = StringPractice.getNumbersInStringSeparatedBy(20, "Hey");
        System.out.println(s);
        StringPractice.recurredPrintDecOrder(15);
        System.out.println();
        StringPractice.recurredPrintAscOrder(-12,18);
        FilePractice.makeFileWithText("output", "Hey! how are you?");
        FilePractice.readFileWithName("src/input.txt");
        FilePractice.calSumFromFile("src/input.txt");
    }
}
