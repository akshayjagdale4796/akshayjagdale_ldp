package collection.linkedlist;

public class Student 
{
	int rn;
	String name;
	Student next;
	public Student(int rn, String name) {
		super();
		this.rn = rn;
		this.name = name;
		this.next = next;
	}
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", next=" + next + "]";
	}

}
