package Assignments.Assignment10;

public class SListIterator<T>
{
    public void insert(SList<T> head, T t)
    {
        SList temp = new SList(t);
        SList curr = head;
        if (head==null)
        {
            head = temp;
            return;
        }
        while(curr.next!=null)
        {
            curr = curr.next;
        }
        curr.next = temp;
    }

    public void remove(SList<T> head, T t)
    {
        SList curr = head;
        if (head.data == t)
        {
            head = head.next;
            return;
        }
        if (head.next==null)
        {
            return;
        }
        while(curr!=null&&curr.next!=null)
        {
            if (curr.next.data==t)
            {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
    }
}
