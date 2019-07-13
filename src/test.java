public class test
{

    public static void main(String args[])
    {
        StaticLinkedList[] a = new StaticLinkedList[StaticLinkedList.MAXSIZE];
        StaticLinkedList.makeList(a);
        StaticLinkedList.insert(a,100,1);
        StaticLinkedList.insert(a,200,2);
        StaticLinkedList.insert(a,300,2);
        StaticLinkedList.insert(a,400,4);
        StaticLinkedList.delete(a,1);
        StaticLinkedList.printList(a);

    }
}
