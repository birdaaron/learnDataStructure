public class StaticLinkedList
{
    private int data=0;
    private int cur=0;
    public static final int MAXSIZE =1000;
    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public int getCur()
    {
        return cur;
    }

    public void setCur(int cur)
    {
        this.cur = cur;
    }

    public static void makeList(StaticLinkedList[] space)
    {
        for(int i = 0;i<MAXSIZE;i++)
        {
            space[i] = new StaticLinkedList();
            space[i].cur = i+1;
        }
        space[MAXSIZE-1].cur = 0;
    }
}
