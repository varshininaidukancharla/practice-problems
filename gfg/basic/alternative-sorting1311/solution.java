import java.util.*;

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);

        int n=arr.length;
        int[] ans=new int[n];

        int left=0;
        int right=n-1;
        int k=0;

        while(left<=right){
            ans[k++]=arr[right--];

            if(left<=right){
                ans[k++]=arr[left++];
            }
        }

        ArrayList<Integer> result=new ArrayList<>();

        for(int i=0;i<n;i++){
            result.add(ans[i]);
        }

        return result;
    }
}