
Let us define the problem statement, before we start our discussion about calculating the height of binary tree. What is height of Binary tree? Conventionally, the longest path from root to deepest leaf node define the height of binary tree.

The example tree is as follows:


-------------------------------------100----------------------Level 1------
-----------------------------------
-------------------------------50----------------150----------Level 2------
-----------------------------
---------------------------25------80 -------125 -------160---Level 3------
--------------------------
------------------------10 --30 --60 --90 --110 --140---------Level 4------



	Root Node 100 is at  level 1 or Height 1
	Node 50, 150 is at Level 2 or Height  2
	Node 25 80, 125. 160 is at Level 3 or Height 3
	Node 10 30 60 90 110 140 is at Level 4 or Height 4
	
	The output of above Tree is :

	Height of Binary Tree : 4