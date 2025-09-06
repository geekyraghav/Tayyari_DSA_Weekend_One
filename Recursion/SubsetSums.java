class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        subsets(arr,0,0,list);
        return list;
    }
    
    private void subsets(int[] arr, int ans, int i, ArrayList<Integer> list) {
        if(i==arr.length){
            list.add(ans);
            return;
        }
        subsets(arr,ans,i+1,list); // skip
        subsets(arr,ans+arr[i],i+1,list); // pick
    }
}
