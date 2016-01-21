package com.prod.utils;

import java.util.List;

/**
 * 树节点类
 * @author sevn
 *
 * @param <T>
 */
public class Node<T> {
	private int isRoot = 0;//0表示非根节点，1表示根节点
	private T data = null;
	private List childNode;
	
	private int childCount = 0;
	
	
	public int getChildCount() {
		return childCount;
	}

	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}

	public Node(){}
	
	public Node(T data){
		this.data = data;
	}
	
	public Node(T data,int isRoot){
		this.data = data;
		this.isRoot = isRoot;
	}

	public int getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(int isRoot) {
		this.isRoot = isRoot;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List getChildNode() {
		return childNode;
	}

	public void setChildNode(List childNode) {
		this.childNode = childNode;
	}
	
	
}
