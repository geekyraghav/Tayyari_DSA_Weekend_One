package ArraysAndArrayLists;
import java.util.ArrayList;
public class ArrayListsInJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr.size());
        arr.add(10); arr.add(20); arr.add(30); arr.add(40);
        System.out.println(arr.size());

        System.out.println(arr); // loop lag raha hai

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        arr.add(90);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        arr.set(0,100); // change
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        arr.clear();
        System.out.println(arr+" "+arr.size());
    }
}
