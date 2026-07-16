class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                list.add(num);
            }
        }

        return list;
    }
}