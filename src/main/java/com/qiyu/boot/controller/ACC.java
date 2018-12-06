package com.qiyu.boot.controller;

import java.util.Stack;

/**
 * @author qiyu
 * @date 2018/11/20
 */
public class ACC {
	public static void main(String[] args) {
		Node node = new Node(1, new Node(2, new Node(3, new Node(4, null))));
		Stack<Node> stack = new Stack<>();
		while (node != null) {
			stack.push(node);
			node = node.next;
		}
		Node root = stack.pop();
		Node tmp = root;
		while (stack.size() > 0) {
			tmp.next = stack.pop();
			tmp = tmp.next;
		}
		tmp.next=null;

		Node newN = swap(root);
		//输出
		do {
			System.out.println(root.getIndex());
			root = root.next;
		} while (root != null);
		//输出
		do {
			System.out.println(newN.getIndex());
			newN = newN.next;
		} while (newN != null);
	}

	static void sout(Node newN){
		do {
			System.out.print(newN.getIndex()+"--");
			newN = newN.next;
		} while (newN != null);
		System.out.println();
	}

	/**
	 * @param node current node
	 * @return node
	 */
	static Node swap(Node node){
		if (node == null || node.next == null) {
			return node;
		}else {
			Node head = swap(node.next);
			node.next.next = node;
			node.next = null;
			return head;
		}
	}

	static Node reverseLinkedList(Node node) {
		Node previousNode = null;
		Node currentNode = node;
		Node nextNode = null;
		Node lastNode = null;
		while (currentNode != null) {
			nextNode = currentNode.next;
			if (nextNode == null) {
				lastNode = currentNode;
			}
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return lastNode;
	}

}

class Node {
	private int index;
	Node next;

	public Node(int index, Node next) {
		this.index = index;
		this.next = next;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}

class Singleton {
	private Singleton() {
	}

	private static volatile Singleton singleton = null;

	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
class LazySingleton {
	private LazySingleton() {

	}
	private static LazySingleton lazySingleton = null;

	public static synchronized LazySingleton getLazySingleton(){
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
}

class HungrySingleton {
	private HungrySingleton(){}

	private static final HungrySingleton hungrySingleton = new HungrySingleton();

	public static HungrySingleton getHungrySingleton(){
		return hungrySingleton;
	}
}

class QuickSort {
	public static void quickSort(int[] a, int left, int right) {
		int key = a[left];
		int l = left;
		int r = right;

	}

}
