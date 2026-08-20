# Triplet Family

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**  of integers, check whether there exist three elements such that the sum of two elements is equal to the third element. 

 **Example:** 

```
Input: arr[] = [1, 2, 2, 3, 4]
Output: true
Explanation: The pair (2, 2) sums to 4.
```

```
Input: arr[] = [5, 4, 3]
Output: false
Explanation: No triplets satisfy the condition.
```

```
Input: arr[] = [0, 0, 1, 0, 0, 1]
Output: true
Explanation: The pair(0, 1) sums to 1.
```

 

**Constraints:
**1 <= arr.size() <= 103
0 <= arr[i] <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T15:17:30.362Z  

```java
class Solution {
    public boolean findTriplet(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(set.contains(sum)){
                    return true;
                }
            }
        }
        return false;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/triplet-family/1)