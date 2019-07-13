package list;

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
    public static void printList(StaticLinkedList[] space)
    {
        for(int j = space[MAXSIZE-1].getCur();space[j].getData()!=0;j=space[j].getCur())
            System.out.println(space[j].getData());
    }
    private static int malloc (StaticLinkedList[] space)
    {
        int freeCur = space[0].cur;
        if(space[0].cur>0)
            space[0].cur = space[freeCur].cur;
        return freeCur;
    }
    public static void insert(StaticLinkedList[] space,int data,int position)
    {
        int oldPosition = MAXSIZE-1;
        int freeCur = StaticLinkedList.malloc(space);
        if(freeCur>0)
        {
            space[freeCur].data = data;
            for(int i = 1;i<position;i++)
                oldPosition = space[oldPosition].cur;
            space[freeCur].cur = space[oldPosition].cur;
            space[oldPosition].cur = freeCur;
        }
    }
    private static void free(StaticLinkedList[] space,int index)
    {
        space[index].cur = space[0].cur;
        space[0].cur = index;
    }
    public static void delete(StaticLinkedList[] space,int position)
    {
        int oldPosition = MAXSIZE-1;
        for(int i = 1;i<position;i++)
            oldPosition = space[oldPosition].cur;
        int delCur = space[oldPosition].cur;
        space[oldPosition].cur = space[delCur].cur;
        free(space,delCur);
    }
}
