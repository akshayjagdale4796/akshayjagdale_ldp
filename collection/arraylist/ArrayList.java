package collection.arraylist;

public class ArrayList 
{
	int a[]=new int[10];
	int index;
	void add(int p)
	{
		if(index<a.length)
		{
			a[index++]=p;
		}
		else
		{
			int b[]=new int[a.length*2];
			for (int i = 0; i < a.length; i++)
			{
				b[i]=a[i];
			}
			a=b;
			a[index++]=p;
		}
	}
	void print()
	{
		for (int i = 0; i < index; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
