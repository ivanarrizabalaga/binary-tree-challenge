Binary tree challenge
=========

Given an input like:  

    [2, 4]
    [1, 2]
    [3, 6]
    [1, 3]
    [2, 5]

Use it to reconstruct this binary tree:
 
                 1
              2      3
           4   5  6
           
Notes:
----
a) The first number in each line is a parent.
b) Second number is a child.
c) The left child always shows up in the input before the right child.

Return root.

You may use the standard or base library included with the language of your choice. Your solution will be evaluated on correctness, runtime complexity (big-O), and adherence to coding best practices. A complete answer will include the following: 
1.	List the language you’re using
2.	Document your assumptions
3.	Explain your approach and how you intend to solve the problem
4.	Provide code comments where applicable
5.	Explain the big-O run time complexity of your solution. Justify your answer
6.	Identify any additional data structure you used and justify why you used them.
You should start by using the example function prototype listed below or recreate in the language of your choice. 

You can assume this method will be called for each pair.


    class com.arrizabalaga.BuildTree {
    public static Node reconstructTree(int[][] input) {
        // TODO: Build the tree from the values in input and return the root node.
    }
    }            