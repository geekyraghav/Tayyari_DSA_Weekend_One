package BinarySearchOnAns;

public class KokoEatingBananas {
    public int kokoEat(int[] arr, int k) {
        int max = arr[0];
        for(int ele : arr){
            max = Math.max(max,ele);
        }
        int lo = 1, hi = max, ans = max;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(canEat(mid,arr,k)){
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return ans;
    }

    private boolean canEat(int speed, int[] arr, int hours) {
        int time = 0;
        for(int ele : arr){
            time += ele/speed;
            if(ele%speed != 0) time++;
        }
        return (time<=hours);
    }
}
