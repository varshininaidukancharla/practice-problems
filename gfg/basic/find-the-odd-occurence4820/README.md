# One Odd Occuring

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array of  **arr[]** positive integers where all numbers occur even number of times except one number which occurs odd number of times. Return that number.

 **Examples:** 

```
Input:arr[] = [1, 2, 3, 2, 3, 1, 3]
Output: 3
Explaination: 3 occurs three times.

```

```
Input:arr[] = [5, 7, 2, 7, 5, 2, 5]
Output: 5
Explaination: 5 occurs three times.

```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T04:11:44.435Z  

```java
class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans ^= arr[i];
            
        }
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-odd-occurence4820/1)