package BinarySearchOnAns;

public class CapacityToShipWithinDDays {
    static int leastWeightCapacity(int[] arr, int n, int d) {
        int sum = 0, max = arr[0];
        for(int ele : arr){
            sum += ele;
            max = Math.max(max,ele);
        }
        int lo = max, hi = sum, ans = sum;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(canShip(mid,arr,d)){
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return ans;
    }

    static boolean canShip(int c, int[] arr, int d) {
        int cap = c, days = 1; // 1 2 3 4 5 6   d=4   c=6
        for(int ele : arr){
            if(cap < ele){
                days++;
                cap = c;
            }
            cap -= ele;
        }
        return (days<=d);
    }
}
