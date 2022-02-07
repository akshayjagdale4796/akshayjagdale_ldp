package oops.encapsulation;

public class Student
{
	private String name;
	private String country;
	
	public void getData()
	{
		System.out.println(name+"   "+country);
	}
	public void setData(String name,String country)
	{
		this.name=name;
		this.country=country;
	}
}
