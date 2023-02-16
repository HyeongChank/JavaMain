package com.ruby.java.ch13.boundGen;

class Bag<T extends Solid> {
  private T thing;
  private String owner;

  public Bag(T thing) {
    this.thing = thing;
  }

  public T getThing() {
    return thing;
  }

  public void setThing(T thing) {
    this.thing = thing;
  }

  void showType() {
    System.out.println("T�� Ÿ���� " + thing.getClass().getName());
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  boolean isSameOwner(Bag<?> obj) {
    if(this.owner.equals(obj.getOwner()))
      return true;
    return false;
  }
}

class Solid { }
class Liquid{ }

class Book extends Solid{ }
class PencilCase extends Solid{ }
class Notebook extends Solid { }

class Water extends Liquid{ }
class Coffee extends Liquid{ }


public class BagTest {

  public static void main(String[] args) {
    Bag<Book> bag = new Bag<>(new Book());
    Bag<PencilCase> bag2 = new Bag<>(new PencilCase());

    bag.setOwner("��Ǫ��");
    bag2.setOwner("��Ǫ��");

    boolean result = bag.isSameOwner(bag2);
    if(result) System.out.println("�����ڰ� �����մϴ�.");
    else System.out.println("�����ڰ� �ٸ��ϴ�.");
  }
}
