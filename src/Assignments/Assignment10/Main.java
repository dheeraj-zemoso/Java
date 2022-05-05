package Assignments.Assignment10;

public class Main
{
    public static void main(String[] args)
    {
        SList head = new SList("Hey");
        SList tail = new SList("Hello");
        head.next = tail;
        SListIterator it = SList.iterator();
        it.insert(head, "Bye");
        System.out.println(SList.toString(head));
        it.remove(head,"Bye");
        System.out.println(SList.toString(head));
    }

}
