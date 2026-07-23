# Find distinct elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array **arr[]**. Your task is to return the count of all the distinct elements in an array

 **Examples:** 

```
Input: arr[] = [2, 2, 3, 2]
Output: 2
```

```
Input: arr[] = [12, 1, 14, 3, 16]
Output: 5
```

 **Constraints:** 
1 ≤ arr.size() ≤ 100
-1000 ≤ arr[i] ≤ 1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-23T18:05:22.541Z  

```java
class Solution {
    static int distinct(int arr[], int n) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }
        return set.size();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-distinct-elements-1614078205/1)