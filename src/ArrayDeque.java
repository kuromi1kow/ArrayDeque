import java.util.Arrays;

public class ArrayDeque {
    private int[] items;
    private int count;
    private int near;
    private int front;
    public ArrayDeque(int capacity){
        items=new int[capacity];
    }
    public void enquequ(int item){
        if(count==items.length) throw new IllegalStateException();
        items[near++]=item;
        count++;
    }

    public int dequequ(){
       var item=items[front];
       items[front]=0;
            front++;
            return item;
    }
    @Override
    public String toString(){
        return Arrays.toString(items);
    }


}
