package list;

public class CircularLinkedList
{
    private int data;
    private CircularLinkedList next;
    private CircularLinkedList rear;
    public void setNext(CircularLinkedList list)
    {
        this.next = list;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public CircularLinkedList getNext()
    {
        return next;
    }
    public static void insertElem(CircularLinkedList head, int position,
                                  CircularLinkedList insertNode)
    {
        CircularLinkedList node = getElem(head,position);
        insertNode.next = node.next;
        node.next = insertNode;
    }
    public static void deleteElem(CircularLinkedList head, int position)
    {
        CircularLinkedList node = getElem(head,position-1);
        CircularLinkedList delNode = getElem(head,position);
        node.next = delNode.next;
        delNode = null;
    }
    public static CircularLinkedList getElem(CircularLinkedList head, int position)
    {
        CircularLinkedList node = head.getNext();
        int j =1;
        while(node!=null&&j<position)
        {
            node = node.getNext();
            j++;
        }
        return node;
    }
    public static CircularLinkedList makeList(int size)
    {
        CircularLinkedList head = new CircularLinkedList();
        CircularLinkedList node = new CircularLinkedList();
        head.next = node;
        for(int i = 0;i<size;i++)
        {
            node.next = new CircularLinkedList();
            node.data = i+1;
            node = node.next;
        }
        node.next = head;
            return head;
    }
    public static void destroyList (CircularLinkedList head)
    {
        CircularLinkedList node =head.getNext();
        while(node!=null)
        {
            CircularLinkedList nextNode = node.next;
            node.next = null;
            node = nextNode;
        }
        head.next = null; //***
    }
}
