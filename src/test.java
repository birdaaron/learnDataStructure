public class test
{

    public static void main(String args[])
    {
        LinkedList head = LinkedList.makeList(3);
        LinkedList node = head.getNext();
        LinkedList insertNode = new LinkedList();
        insertNode.setData(100);
        LinkedList.insertElem(head,2,insertNode);
        LinkedList.deleteElem(head,3);
        for(int i=0;i<4;i++)
        {
            System.out.println(node.getData());
            node = node.getNext();
        }

    }
}
