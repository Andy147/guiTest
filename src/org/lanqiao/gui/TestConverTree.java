package org.lanqiao.gui;
/**
 * 将一个有序的数组插入二叉树中
 * @author andy
 *
 */
public class TestConverTree {
	class Node{
		int data;
		Node left;
		Node right;
		public Node() {
			
		}
		public Node(int data){
			this.data = data;
		}
		public Node(int data , Node left , Node right){
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	public static void main(String[] args) {
	int[] array = {1,2,3,4,5};
	TestConverTree tree = new TestConverTree();
	tree.printMid(tree.arrayConverBst(array, 0, array.length - 1));
		
	}
	public void printMid(Node node){
		if (node.left != null) {
			printMid(node.left);
		}
		System.out.println(node.data);
		if (node.right != null) {
			printMid(node.right);
		}
	}
	public Node arrayConverBst(int[] data , int start , int end){
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		Node current = new Node(data[mid]);
		current.left = arrayConverBst(data , start , mid - 1);
		current.right = arrayConverBst(data , mid + 1 , end);
		return current;
		
	}
	

}
