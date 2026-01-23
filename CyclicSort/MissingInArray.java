package CyclicSort;

public class MissingInArray {
    int missingNum(int arr[]) {
        int i = 0;
        while(i<arr.length){
            if(arr[i] == i+1 || arr[i] == arr.length + 1) i++;
            else{ // put arr[i] in correct place
                int idx = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] != i+1) return i+1;
        }
        return i+1;
    }
}
