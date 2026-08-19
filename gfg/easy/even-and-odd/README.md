# Even at Even Index and Odd at Odd

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of size  **n**  containing an equal number of even and odd integers, rearrange the array so that:

- Every even index contains an even number.
- Every odd index contains an odd number.

Return the rearranged array.

 **Note:**  There may be multiple valid answers. Return any one of them. Use 0-based indexing.

 **Examples:** 

```
Input: arr[] = [3, 6, 12, 1, 5, 8]
Output: [6, 3, 12, 1, 8, 5]
Explanation: The even indices (0, 2, 4) contain even numbers, and the odd indices (1, 3, 5) contain odd numbers.
```

```
Input: arr[] = [1, 2, 3, 4]
Output: [2, 1, 4, 3]
Explanation: The even indices contain even numbers, and the odd indices contain odd numbers.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:00:25.178Z  

```java
class Solution {
    public int[] reArrange(int[] arr) {
        // code here
        int n=arr.length;
        int[] even = new int[n/2];
        int[] odd = new int[n/2];
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even[e++]=arr[i];
            }
            else{
                odd[o++]=arr[i];
            }
        }
        e=0;
        o=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=even[e++];
            }
            else{
                arr[i]=odd[o++];
            }
        }
        return arr;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/even-and-odd/1)