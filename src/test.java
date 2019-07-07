public class test
{

    public static void main(String args[])
    {
        StaticLinkedList[] a = new StaticLinkedList[StaticLinkedList.MAXSIZE];
        StaticLinkedList.makeList(a);
        for(int i = 1;i<3;i++)
            a[i].setData(i*100);
        a[0].setCur(3);
        for(int j = 1;a[j].getData()!=0;j=a[j].getCur())
            System.out.println(a[j].getData());

    }
}
