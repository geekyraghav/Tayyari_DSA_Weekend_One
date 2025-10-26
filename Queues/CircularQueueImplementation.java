package Queues;
class CircularQueue{
    // queue is from f to r-1
    private int[] arr;
    private int f;
    private int r;
    private int size;
    CircularQueue(int capacity){
        arr = new int[capacity];
    }
    int size(){
        return size;
    }
    void add(int ele) throws Exception{
        if(size==arr.length) throw new Exception("Queue is Full!");
        arr[r++] = ele;
        if(r==arr.length) r = 0;
        size++;
    }
    int remove() throws Exception{
        if(size==0) throw new Exception("Queue is Empty!");
        int peek = arr[f];
        f++;
        if(f==arr.length) f = 0;
        size--;
        return peek;
    }
    int peek() throws Exception{
        if(size==0) throw new Exception("Queue is Empty!");
        return arr[f];
    }
    void display(){
        if(r>f){
            for(int i=f;i<=r-1;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=f;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<=r-1;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
public class CircularQueueImplementation {
    public static void main(String[] args) throws Exception{
        CircularQueue q = new CircularQueue(5);
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        q.display();
        // q.add(60); // Exception
        q.remove(); q.remove();
        q.add(60); q.add(70);
        q.display();
    }
}
