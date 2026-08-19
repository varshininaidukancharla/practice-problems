# At least Two Greater

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array arr of distinct elements, the task is to return an array of all elements except the two greatest elements in sorted order.

 **Examples:** 

```
Input: arr[] = [2, 8, 7, 1, 5]
Output: [1, 2, 5] 
Explanation: Here we return an array contains 1, 2, 5 and we leave two greatest elements 7 & 8. 
```

```
Input: arr[] = [7, -2, 3, 4, 9, -1]
Output: [-2, -1, 3, 4]
Explanation:  Here we return an array contains -2,  -1,  3,  4 and we leave two greatest elements 7 & 9. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T04:07:02.975Z  

```java
class Solution {
    public long[] findElements(long arr[]) {
        // code he        
        int n= arr.length;
        Arrays.sort(arr);
        long[] brr = new long[n-2];
        for(int i=0;i<n-2;i++){
            brr[i]=arr[i];        
            
        }
        return brr;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1)