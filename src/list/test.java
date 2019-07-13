package list;

public class test
{

    public static void main(String args[])
    {
        CircularLinkedList a = CircularLinkedList.makeList(3);
        CircularLinkedList i = new CircularLinkedList();
        i.setData(100);

        for(CircularLinkedList head = a;head.getNext()!=a;head = head.getNext())
            System.out.println(head.getData());
    }
}
