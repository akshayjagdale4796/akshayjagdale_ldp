package assignment;

public class Assgt2 {

	public static void main(String[] args)
	{
		int i=1;
		while(i<100)
		{
			if((i%3==0)&&(i%5==0))
			{
				System.out.println(i+" fizzbuzz");
				
			}
			else 
			{
				if(i%3==0)
				{
					System.out.println(i+"  fizz");
				}
				else if(i%5==0)
				{
					System.out.println(i+"  buzz");
				}
				else
					System.out.println(i);
			}
			i++;
		}
	}

}
