
package org.learn.Question;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfTree {
	public static int heightOfTree(Node root) {
		if (root == null) {
			System.out.println("Tree is empty");
			return -1;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		// level delimiter
		queue.offer(null);
		int height = 0;
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			if (null == node) {
				if (!queue.isEmpty()) {
					// level delimiter
					queue.offer(null);
				}
				height++;
			} else {
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
		}
		return height;
	}
}
