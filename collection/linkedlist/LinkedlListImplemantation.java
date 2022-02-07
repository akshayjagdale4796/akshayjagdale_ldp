package collection.linkedlist;

public class LinkedlListImplemantation 
{
	Student s;
	void add(Student Stud)
	{
		if(s==null)
		{
			s=Stud;
		}
		else
		{
			Student p=s;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=Stud;
		}
	}
	void print()
	{
		Student p=s;
		while(p!=null)
		{
			System.out.println(p.rn+"  "+p.name);
			p=p.next;
		}
	}
}
