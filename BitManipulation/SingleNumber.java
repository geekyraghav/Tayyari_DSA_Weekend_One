package BitManipulation;

public class SingleNumber {
    int getSingle(int arr[]) {
        int x = 0;
        for(int ele : arr){
            x = x^ele;
        }
        return x;
    }
}
