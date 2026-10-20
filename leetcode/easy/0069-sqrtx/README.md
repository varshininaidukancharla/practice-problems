# Sqrt(x)

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a non-negative integer `x`, return  *the square root of* `x` *rounded down to the nearest integer*. The returned integer should be  **non-negative**  as well.

You  **must not use**  any built-in exponent function or operator.

- For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

 

 **Example 1:** 

```
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

```

 **Example 2:** 

```
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

```

 

 **Constraints:** 

- 0 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 19.02%)  
**Memory:** 42.2 MB (beats 94.63%)  
**Submitted:** 2026-10-20T12:51:56.171Z  

```java
class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        long left = 1;
        long right = x/2;
        while(left<=right){
            long mid = left + (right-left)/2;
            long square = mid*mid;
            if(square == x) return (int) mid;
            else if(square<x) left=mid+1;
            else right = mid-1;
        }
        return (int)right;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sqrtx/)