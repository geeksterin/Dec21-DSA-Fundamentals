
**Terms**
1. Nodes
2. Edge 
3. root node
4. parent 
5. child 
6. grandParent 
7. Path : Sequence of consecutive edges upto the node.
8. leaf nodes
9. non leaf nodes / Internal nodes.
10. Ancestor and descendents 
11. Subtree.
12. Levels 
13. Sibling nodes and cousin
14. Degree of a node: The degree of a node of a tree is the number of subtrees having this node as a root. 
				  In other words, the degree is the number of descendants of a node. If the degree is zero, 
				  it is called a terminal or leaf node of a tree.
15. Degree of a Tree: max degree of any node

16. height of Node : The height of a node is the number of edges from the node to the deepest leaf. 
				 The height of a tree is a height of the root.

Height of Tree : Height of root node.
Depth of a tree : Length of path from root to that node.
Diameter of a tree.

#nodes  = (n-1) edges


**Binary Tree Properties**
----------------------------
1. Each node has ATMOST 2 children.
2. Max no of nodes possible at any level 'i' = 2^i.
3. Max no of nodes of height 'h' => 2^(h+1) - 1
4. Min no of nodes at height 'h' => h+1;

***Binary Tree Types:***
1. Full/Strict/Proper Binary Tree :  BinaryTree with 0 or 2 children. => #internal node +1 = left node.
                                     A full binary tree.is a binary tree in which each node has exactly zero or two children.
2. Complete Binary Tree : BT with all levels completely filled except the last level and placing of 
						  nodes MUST be done from Left to right direction.
3. Perfect Binary Tree : BT with all internal nodes have 2 children and all leaves are at same level.

4. Left and right skewed Tree.

***Array representation of CBT***
left child = (2*root)+1
right child = (2*root)+2;
parent = floor((i-1)/2)
//https://www.geeksforgeeks.org/binary-tree-array-implementation/



**Problems on Binary Trees.**
1. Inorder , pre-order, post-order using recursion.
2. getCount of nodes.
3. getLeaf counts
4. getSum of nodes.
5. Height of tree
6. Depth of  a tree
7. Printing all leaves of tree / print non-leaves of a tree
8. PrintKthLevel

Print left nodes only (Recursive + Iterative)
Print right nodes only.(Recursive + Iterative)
Level order traversal (Recursive + Iterative)

https://leetcode.com/problems/path-sum/
https://leetcode.com/problems/average-of-levels-in-binary-tree/
https://leetcode.com/problems/leaf-similar-trees/