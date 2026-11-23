# Move Zeroes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

 **Note**  that you must do this in-place without making a copy of the array.

 

Original
Java
 **Example 1:** 

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Could you minimize the total number of operations done?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 94.88%)  
**Memory:** 47.3 MB (beats 76.90%)  
**Submitted:** 2026-11-23T12:39:03.199Z  

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int left = 0;
        for(int right=0;right<n;right++){
            if(nums[right]!=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]= temp;
                left++;
            }
        }
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/move-zeroes/)