# Min Diff Pair

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array **arr[]**. find the minimum difference between any pair in the given array.

 **Examples:** 

```
Input: arr[] = [2, 4, 5, 9, 7]
Output: 1
Explanation: Difference between 5 and 4 is 1.

```

```
Input: arr[] = [3, 10, 8, 6]
Output: 2
Explanation: Difference between 8 and 6 is 2.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T15:56:22.689Z  

```java
class Solution {
    public int minDiff(int[] arr) {
        // code here
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            mini=Math.min(mini,arr[i]-arr[i-1]);
        }
        return mini;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-difference-pair5444/1)