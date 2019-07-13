package list;

public class LinkedList
{
    private int data;
    private LinkedList next;
    public void setNext(LinkedList list)
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

    public LinkedList getNext()
    {
        return next;
    }
    public static void insertElem(LinkedList head,int position,LinkedList insertNode)
    {
        LinkedList node = getElem(head,position);
        insertNode.next = node.next;
        node.next = insertNode;
    }
    public static void deleteElem(LinkedList head,int position)
    {
        LinkedList node = getElem(head,position-1);
        LinkedList delNode = getElem(head,position);
        node.next = delNode.next;
        delNode = null;
    }
    public static LinkedList getElem(LinkedList head,int position)
    {
        LinkedList node = head.getNext();
        int j =1;
        while(node!=null&&j<position)
        {
            node = node.getNext();
            j++;
        }
        return node;
    }
    public static LinkedList makeList(int size)
    {
        LinkedList head = new LinkedList();
        LinkedList node = new LinkedList();
        head.next = node;
        for(int i = 0;i<size;i++)
        {
            node.next = new LinkedList();
            node.data = i+1;
            node = node.next;
        }
            return head;
    }
    public static void destroyList (LinkedList head)
    {
        LinkedList node =head.getNext();
        while(node!=null)
        {
            LinkedList nextNode = node.next;
            node.next = null;
            node = nextNode;
        }
        head.next = null; //***
    }
}
