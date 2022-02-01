### Hashing: 
-   It's a one way function which converts any arbitary length input into a fixed length output.

### HashTables:
-   Defination 1: It's a data structure which stores things in key value pair.
-   Defination 2: It's a associative array which makes use of hashing to store values using the hash output as key.

## Arrays vs Linked List.
### Strength of Array:
-   Memory allocation is contiguous , ie searching is fast when compared to LinkedList
-   Random access is allowed in arrays due to indexes.
-   ## TC for search :
        1. If the  array is sorted: WC: O(lgN) and in best case O(1).
        2. If the array is unsorted => WC: O(N). and in best case O(1).
-   ## Insertion: 
        Unsorted Array: is constant aka O(1) => when u inserting elements using index directly.
        Sorted Array:  BS(lgN) + Shifting of elements(O(N)) + Inserting at correct loc (O(1)) => TC O(N).
-   ## Deletion:
        Sorted and Unsorted Array: If deleting at end => O(1), BUT if deleting in middle/anywhere else apart from last TC O(N) this is due to shifting of elements to fill the gap/hole.
-   ## Cache Friendly: 

### Limitations of Arrays:
-   Fixed length (u need to know things in advance).
    - Mitigation: dynamic array -> vector, arraylist.
-   Insertion and deletion is O(N).
-   Internal fragmentation : Under untilization of allocated memory.
-   External fragmentation: Total memory is available , but due to continguous nature, you cannot allocate     array of desired size.

### Strength of LinkedList:
-   Memory is NOT continguous => NO RANDOM ACCESS possible.
-   Since they are not continguous they can EXPAND.
-   NO EXTERNAL FRAGMENTATION in linkedList.
-   TC for Search:
        1. Sorted/Unsorted List: O(N).
-   Insertion:
        1. At beginning: O(1).
        2. In middle/end: O(N).
-   Deletion:
        1. At beginning: O(1)
        2. In middle/end: O(N).

### Limitations of LinkedList:
    1. NO RANDOM ACCESS possible.
    2. O(N) TC for insertion/deletion if done apart from beginning.
    3. Sorted/Unsorted List: O(N).
    4. Linked List are NOT cache friendly.

## Quick Sort vs Merge Sort

-   TC for Quick Sort: Worst Case=> O(N*N), Best Case => O(NlgN).
-   TC for Merge Sort: Theta(NlgN)

- Where can you apply Quick Sort: Arrays, ArraysList.
- Where can you apply Merge Sort: Arrays and LinkedLists. [Universal Sort Algorithm]

    