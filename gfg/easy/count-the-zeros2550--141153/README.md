# Zeros Count in Sorted Binary

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]** of only  **0** 's and  **1** 's. The array is sorted in descending order. Find the count of all the 0's.

 **Examples:** 

```
Input: arr[] = [1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0]
Output: 3
Explanation: There are 3 0's in the given array.
```

```
Input: arr[] = [0, 0, 0, 0, 0]
Output: 5
Explanation: There are 5 0's in the array.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T04:29:45.685Z  

```java
class Solution {
    public int countZeroes(int[] arr) {
        // code here
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0){
                count++;
                
            }
            else{
                    break;
                }
        }
        return count;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-the-zeros2550--141153/1)