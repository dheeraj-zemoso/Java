package Assignments.Assignment10;

public class SList<T>
{
    T data;
    SList next;

    public SList(T t)
    {
        data = t;
    }

    public static String toString(SList head)
    {
        StringBuilder sb = new StringBuilder("");
        SList curr = head;
        while(curr!=null)
        {
            sb.append(curr.data+" ");
            curr = curr.next;
        }
        return sb.toString();
    }

    public static SListIterator iterator()
    {
        return new SListIterator();
    }
}
