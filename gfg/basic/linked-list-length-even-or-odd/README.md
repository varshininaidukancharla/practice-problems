# Is Linked List Length Even

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a linked list, check whether the length of the linked list is even or not. Return true if it is even, otherwise false.

 **Examples:** 

```
Input: Linked list: 12->52->10->47->95->0

Output: true
Explanation: The length of the linked list is 6 which is even.
```

```
Input: Linked list: 9->4->3

Output: false
Explanation: The length of the linked list is 3 which is odd.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-15T14:16:39.041Z  

```java
/* structure of link list node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public boolean isEven(Node head) {
        // code here
        int count =0;
        while(head != null){
            head = head.next;
            count++;
        }
        if(count % 2 ==0){
            return true;
        }
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/linked-list-length-even-or-odd/1)