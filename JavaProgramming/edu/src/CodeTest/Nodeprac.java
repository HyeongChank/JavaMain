package CodeTest;

public class Nodeprac {
	node first;
	public void add(int k) {
		node newnode = new node(k);
		node p = first;
		node q = null;
		System.out.println(p);
	}
	public static void main(String[] args) {
		
		

	}

}

class node{
	int data;
	node link;
	public node(int k) {
		this.data = k;
	}
}