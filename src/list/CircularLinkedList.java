package list;

public class CircularLinkedList
{
    private int data;
    private CircularLinkedList next;
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
    public static void insertElem(CircularLinkedList[] list, int position,
                                  CircularLinkedList insertNode)
    {
        CircularLinkedList node = getElem(list[0],position);
        insertNode.next = node.next;
        node.next = insertNode;
        if(insertNode.next==list[0])
            list[1] = insertNode;
    }
    public static void deleteElem(CircularLinkedList[] list, int position)
    {
        CircularLinkedList node = getElem(list[0],position-1);
        CircularLinkedList delNode = getElem(list[0],position);
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
    public static CircularLinkedList[] makeList(int size)
    {
        CircularLinkedList head = new CircularLinkedList();
        CircularLinkedList node = new CircularLinkedList();
        CircularLinkedList rear = new CircularLinkedList();
        CircularLinkedList[] list = new CircularLinkedList[2];
        head.next = node;
        for(int i = 0;i<size;i++)
        {
            node.next = new CircularLinkedList();
            node.data = i+1;
            node = node.next;
        }
        node.next = head;
        list[0] = head;
        rear.next = node;
        list[1] = rear;
        return list;
    }
    public static void destroyList (CircularLinkedList[] list)
    {
        CircularLinkedList node =list[0].getNext();
        while(node!=null)
        {
            CircularLinkedList nextNode = node.next;
            node.next = null;
            node = nextNode;

        }

    }
}
