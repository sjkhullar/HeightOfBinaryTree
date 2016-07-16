package org.learn.Client;

import org.learn.Question.HeightOfTree;
import org.learn.Question.Node;

public class App {
	public static void main(String[] args) {
		// root level 0
		Node A = Node.createNode(60);
		// Level 1
		Node B = Node.createNode(20);
		Node C = Node.createNode(80);
		// Level 2
		Node D = Node.createNode(10);
		Node E = Node.createNode(30);
		Node F = Node.createNode(70);
		Node G = Node.createNode(90);
		// Level 3
		Node H = Node.createNode(65);
		Node I = Node.createNode(75);
		Node J = Node.createNode(85);
		Node K = Node.createNode(95);

		// connect Level 0 and 1
		A.left = B;
		A.right = C;
		// connect level 1 and level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
		// connect level 2 and level 3
		F.left = H;
		F.right = I;
		G.left = J;
		G.right = K;

		int height = HeightOfTree.heightOfTree(null);
		if (height > 0) {
			System.out.println("Height of a Binary Tree : " + height);
		} else {
			System.out.println("Unable to calculate height of a binary tree");
		}

	}
}
