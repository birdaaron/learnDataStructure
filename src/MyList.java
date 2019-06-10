public class MyList
{
    private Object[] data;
    public MyList()
    {
        this.data = new Object[0];
    }
    public final int size()
    {
        int size = 0;
        for(int i = 0;data[i]!=null;i++)
            size++;
        return size;
    }
    public final boolean isEmpty()
    {
        return this.size() == 0;
    }
    public final void clear()
    {
        for(int i = 0;i<this.size();i++)
            this.data[i] = null;
    }
    public Object getElem(int index)
    {
        return this.data[index];
    }
    public  boolean locateElem(Object son)
    {
        for(int i =0;i<this.size();i++)
            if(this.data[i] == son)
                return true;
        return false;
    }
    public void insert(int index,Object son)
    {
        Object[] newData = new Object[this.size()+1];
        for(int i=0;i<this.size();i++)
            if(i<index)
                newData[i] = this.data[i];
            else
                newData[i+1] = this.data[i];
        newData[index] = son;
    }
    public Object delete(int index)
    {
        Object[] newData = new Object[this.size()-1];
        for(int i=0;i<this.size();i++)
            if(i<index)
                newData[i] = this.data[i];
            else
                newData[i] = this.data[i+1];
        return this.data[index];
    }
    public final void add(Object son)
    {
        insert(size(),son);
    }
    public static void main(String[] args)
    {
        Integer a = null;
        int b= a.intValue();
        System.out.println(a);
    }
}
