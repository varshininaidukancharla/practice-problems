# Second Largest

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of positive integers  **arr[]**, return the second largest element from the array. If the second largest element doesn't exist then return  **-1.** 

Note: The second largest element should not be equal to the largest element.

 **Examples:** 

```
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
```

```
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
```

```
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T05:50:53.989Z  

```java
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int larg =-1;
        int slarg = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>larg){
                larg = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>slarg && arr[i]!=larg){
                slarg = arr[i];
            }
        }
        return slarg;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/second-largest3735/1)