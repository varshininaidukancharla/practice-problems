# Sort a String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string consisting of lowercase letters, arrange all its letters in ascending order. 

 **Examples:** 

```
Input: s = "edcab"
Output: "abcde"
Explanation: characters are in ascending
order in "abcde".

```

```
Input: s = "xzy"
Output: "xyz"
Explanation: characters are in ascending
order in "xyz".
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T15:24:59.031Z  

```java
class Solution {
    public String sortString(String s) {
        // code here
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-a-string2943/1)