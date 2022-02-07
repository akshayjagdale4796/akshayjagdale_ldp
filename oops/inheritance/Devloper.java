package oops.inheritance;

public class Devloper extends  Employee
{
	int bonus=10000;
	public static void main(String[] args) 
	{
		Devloper obj=new Devloper();
		System.out.println("Devloper salary is  :"+obj.sal);
		System.out.println("Devloper bonus  is   :"+obj.bonus);

	}

}
