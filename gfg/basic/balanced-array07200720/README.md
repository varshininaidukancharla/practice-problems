# Balanced Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]** of even size, find the minimum value that needs to be added to any one element so that the array becomes balanced. An array is considered balanced when the sum of elements in the left half is equal to the sum of elements in the right half.

 **Examples :** 

```
Input: arr = [1, 5, 3, 2]
Output: 1
Explanation: Sum of first 2 elements is 1 + 5  = 6, Sum of last 2 elements is 3 + 2  = 5, To make the array balanced you can add 1.
```

```
Input: arr = [1, 2, 1, 2, 1, 3]
Output: 2
Explanation: Sum of first 3 elements is 1 + 2 + 1 = 4, Sum of last three elements is 2 + 1 + 3 = 6, To make the array balanced you can add 2.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-15T06:43:29.791Z  

```java
class Solution {
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int n = arr.size();
        int mid = n/2;
        int left = 0;
        int right = 0;
        for(int i=0;i<=mid-1;i++){
            left+=arr.get(i);
        }
        for(int j=mid;j<n;j++){
            right += arr.get(j);
        }
        return Math.abs(left-right);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/balanced-array07200720/1)