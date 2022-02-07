package oops.abstraction;

public class Yamaha extends Bike
{
	void run()
	{
		System.out.println(" running safely max speed limit is 100");
	}

	public static void main(String[] args) 
	{
		Bike bike=new Yamaha();
		bike.run();
	}

}
