package DataStructure_tree;

import java.util.Comparator;

public class BinTree01<K,V> {

	static class Node<K,V>{
		private K key;
		private V value;
		private Node<K,V> left;
		private Node<K,V> right;
		
		Node(K key, V value, Node<K,V> left, Node<K,V> right){
			this.key = key;
			this.value = value;
			this.left = left;
			this.right = right;
		}

		K getKey() {
			return key;
		}
		V getValue() {
			return value;
		}
		void print() {
			System.out.println(value);
		}
		
	}

	private Node<K,V> root;
	
	private Comparator<? super K> comparator = null;
	public BinTree01(){
		root = null;
	}
	public BinTree01(Comparator<? super K> c) {
		this();
		comparator = c;
	}
	private int compare(K key1, K key2) {
		return (comparator ==null) ? ((Comparable<K>key1).compareTo(key2) : comparator.compare(key1, key2);
	}
	
	
}
