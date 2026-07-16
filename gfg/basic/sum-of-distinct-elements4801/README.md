# Sum of distinct elements

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an array  **a**  **rr**. Find the sum of distinct elements in an array.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: 15
Explanation: Distinct elements are 1, 2, 3, 4, 5. So sum is 15.
```

```
Input: arr[] = [5, 5, 5, 5, 5]
Output: 5
Explanation: Only Distinct element is 5. So sum is 5.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-16T07:05:27.311Z  

```java
class Solution {
    int findSum(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int sum=0;
        for(int num: set){
            sum+=num;
        }
        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-distinct-elements4801/1)