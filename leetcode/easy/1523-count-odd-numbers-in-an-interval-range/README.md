# Count Odd Numbers in an Interval Range

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two non-negative integers `low` and `high`. Return the  *count of odd numbers between* `low` *and* `high` *(inclusive)*.

 

 **Example 1:** 

```
Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
```

 **Example 2:** 

```
Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].
```

 

 **Constraints:** 

- 0 <= low <= high <= 10^9

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.9 MB  
**Submitted:** 2026-07-16T16:42:28.831Z  

```java
class Solution {
    public int countOdds(int low, int high) {
        int count =0;
        for(int i=low;i<=high/2;i++){
            if(i%2 !=0){
                count++;
            }
            
        }
        return count*2;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/)