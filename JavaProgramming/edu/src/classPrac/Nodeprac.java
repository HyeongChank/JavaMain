package classPrac;


class Link{
	private int num;
	private Link next;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Link getNext() {
		return next;
	}
	public void setNext(Link next) {
		this.next = next;
	}
	public Link(int num, Link next) {
		this.num = num;
		this.next = next;
	}
	
}


public class Nodeprac {
	static Link head;
	public static void add(int k){
		Link n = head; 
		head = new Link(k,n);
	}
	public static void print() {
		Link n = head;
		while(n!=null) {
			System.out.println(n.getNum());
			n = n.getNext();
		}
	}
	public static void main(String[] args) {
		
		add(1);
		add(10);
		add(3);
		print();
		

	}

}


