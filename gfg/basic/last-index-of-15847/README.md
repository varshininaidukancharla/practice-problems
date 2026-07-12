# Last index of One

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**  consisting of only ' **0** 's and ' **1** 's,  find the last index of the '1' present.

Note: If '1' is not present, return "-1"

 **Examples:** 

```
Input: s = 00001
Output: 4
Explanation: Last index of  1 in given string is 4.

```

```
Input: s = 0
Output: -1
Explanation: Since, 1 is not present, so output is -1.
```

 **Expected Time Complexity:**  O(n)
 **Expected Auxillary Space:**  O(1)

 **Constraints:** 
1 <= |s| <= 106
s = {0,1}

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-12T04:06:33.517Z  

```java
class Solution {
    public int lastIndex(String s) {
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                return i;
            }
            
        }
        return -1;
        
    }
    
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/last-index-of-15847/1)