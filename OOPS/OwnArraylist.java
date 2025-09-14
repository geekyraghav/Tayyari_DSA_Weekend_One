package OOPS;
class MyArrayList{ // User defined data structure
    private int[] arr;
    private int idx;
    MyArrayList(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(idx== arr.length) increaseCapacity();
        arr[idx++] = ele;
    }
    int get(int index) throws Exception{
        if(index<0 || index>=idx) throw new Exception("Index out of Bound");
        return arr[index];
    }
    void remove() throws Exception{
        if(size()==0) throw new Exception("Array is Empty!");
        idx--;
    }
    void remove(int index) throws Exception{
        if(index<0 || index>=idx) throw new Exception("Index out of Bound");
        // khud karo HOMEWORK
    }
    void add(int index, int ele) throws Exception{
        if(index<0 || index>=idx) throw new Exception("Index out of Bound");
        // khud karo HOMEWORK
    }
    void increaseCapacity(){
        int[] brr = new int[(arr.length)*2];
        for(int i=0;i<arr.length;i++){
            brr[i] = arr[i];
        }
        arr = brr;
    }
    void display(){
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int capacity(){
        return arr.length;
    }
    int size(){
        return idx;
    }
}
public class OwnArraylist {
    public static void main(String[] args) throws Exception{
        MyArrayList a = new MyArrayList(5);
        // a.remove(); // ERROR
        a.add(10); a.add(60); a.add(230); a.add(20);
        a.display();
        System.out.println(a.size()+" "+a.capacity());
        a.add(90);
        a.display();
        System.out.println(a.size()+" "+a.capacity());
        a.add(12);
        a.display();
        System.out.println(a.size()+" "+a.capacity());
        System.out.println(a.get(3));
        System.out.println(a.get(7));
    }
}
