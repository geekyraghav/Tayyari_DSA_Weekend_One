package CyclicSort;
import java.util.ArrayList;
public class ArrayDuplicates {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int idx = arr[i] - 1;
            if(arr[i] == i+1 || arr[i] == arr[idx]) i++;
            else{ // put arr[i] in correct place
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(i=0;i<arr.length;i++){
            if(arr[i] != i+1) ans.add(arr[i]);
        }
        return ans;
    }
}
