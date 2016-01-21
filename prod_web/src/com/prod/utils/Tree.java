package com.prod.utils;

/**
 * 构树类
 * @author sevn
 *
 * @param <T>
 */
public class Tree<T> {
	private Node<T> root;
	
	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	
	public Tree(Node<T> root){
		this.root = root;
	}
}
