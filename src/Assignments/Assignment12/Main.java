package Assignments.Assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List<Student> list = new ArrayList<>();
        list.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        list.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        list.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        list.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        list.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        list.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        list.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        list.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        list.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        list.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        list.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        list.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        list.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        list.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        list.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        list.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        list.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        //1
        List<String> list1 = list.stream().map(Student->Student.engDepartment).distinct().collect(Collectors.toList());
        //2
        List<String> list2 = list.stream().filter(Student->Student.yearOfEnrollment>2018).map(Student->Student.name).collect(Collectors.toList());
        //3
        List<Student> list3 = list.stream().filter(Student->Student.engDepartment.equals("Computer Science")&&Student.gender.equals("Male")).collect(Collectors.toList());
        //4
        Map<String, Long> list4 = list.stream().collect(Collectors.groupingBy(Student->Student.gender, Collectors.counting()));
        //5
        Map<String, Double> list5 = list.stream().collect(Collectors.groupingBy(Student->Student.gender, Collectors.averagingDouble(Student->Student.age)));
        //6
        Student maxStudent = list.stream().max(Comparator.comparing(Student->Student.perTillDate)).get();
        //7
        Map<String, Long> list7 = list.stream().collect(Collectors.groupingBy(Student-> Student.engDepartment, Collectors.counting()));
        //8
        Map<String, Double> list8 = list.stream().collect(Collectors.groupingBy(Student->Student.engDepartment, Collectors.averagingDouble(Student->Student.perTillDate)));
        //9
        Student minStudent = list.stream().filter(Student->Student.engDepartment.equals("Electronic")&&Student.gender.equals("Male")).collect(Collectors.minBy(Comparator.comparing(Student->Student.age))).get();
        //10
        Map<String, Long> list10 = list.stream().filter(Student->Student.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(Student-> Student.gender, Collectors.counting()));

        System.out.println("1. "+list1);
        System.out.println("2. "+list2);
        System.out.print("3. ");
        printList(list3);
        System.out.println("4. "+list4);
        System.out.println("5. "+list5);
        System.out.print("6. ");
        maxStudent.print();
        System.out.println("7. "+list7);
        System.out.println("8. "+list8);
        System.out.print("9. ");
        minStudent.print();
        System.out.println("10. "+list10);

    }
    private static void printList(List<Student> list)
    {
        for (Student student : list)
        {
            student.print();
        }
    }
}
