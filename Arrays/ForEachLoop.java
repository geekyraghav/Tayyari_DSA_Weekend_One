package ArraysAndArrayLists;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] a = {5,3,7,2,6,6,8,2,2};
        for(int i=0;i<a.length;i++){
            a[i] *= 2;
        }
        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
}
