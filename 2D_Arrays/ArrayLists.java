package MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(13); a.add(36); a.add(132);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1); b.add(2); b.add(3);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(2); c.add(3); c.add(5); c.add(7); c.add(11);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

        // System.out.println(arr);

//        for(int i=0;i<arr.size();i++){
//            for(int j=0;j<arr.get(i).size();j++){
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10); arr.get(arr.size()-1).add(20);
        for(ArrayList<Integer> list : arr){
            for(int ele : list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<Integer>());
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) ans.get(i).set(j,1); // arr[i][j] = 1
                else{
                    int val = ans.get(i-1).get(j)+ans.get(i-1).get(j); // val = arr[i-1][j] + arr[i-1][j-1]
                    ans.get(i).set(j,val);
                }
            }
        }
        return ans;
    }
}
