package Assignments.Assignment12;

public class PrintStudent
{
    public static void print(Student student)
    {
        System.out.println("ID = "+student.id);
        System.out.println("Name = "+student.name);
        System.out.println("Age = "+student.age);
        System.out.println("Gender = "+student.gender);
        System.out.println("Engineering Department = "+student.engDepartment);
        System.out.println("Year of Enrollment = "+student.yearOfEnrollment);
        System.out.println("per Till Date = "+student.perTillDate);
    }
}
