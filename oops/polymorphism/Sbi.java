package oops.polymorphism;

public class Sbi extends Bank
{
	public void rateOfIntreast()
	{
		System.out.println(" SBI Bank Rate of Interest is 7.0 % ");
	}
	public static void main(String[] args)
	{
		Bank bank=new Sbi();
		bank.rateOfIntreast();
	}
}
