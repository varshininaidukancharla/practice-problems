class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ans.add(-1);
        }
        int n=arr.length;
        Stack<Integer> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans.set(i,st.peek());
            }
            st.push(arr[i]);
        }
        return ans;
    }
}