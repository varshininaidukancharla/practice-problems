# First and Second Smallests

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array,  **arr[]**  of integers, your task is to return the  **smallest**  and  **second smallest**  element in the array. If the smallest and second smallest do not exist, return  **-1.** 

 **Examples:** 

```
Input: arr[] = [2, 4, 3, 5, 6]
Output: [2, 3] 
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.
```

```
Input: arr[] = [1, 1, 1]
Output: [-1]
Explanation: Only element is 1 which is smallest, so there is no second smallest element.
```

 **Constraints:** 
1 ≤ arr.size ≤105
1 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T07:26:03.235Z  

```java
class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {

        int small = Integer.MAX_VALUE;
        int ssmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < small) {
                ssmall = small;
                small = arr[i];
            }
            else if (arr[i] > small && arr[i] < ssmall) {
                ssmall = arr[i];
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if (ssmall == Integer.MAX_VALUE) {
            ans.add(-1);
        }
        else {
            ans.add(small);
            ans.add(ssmall);
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1)