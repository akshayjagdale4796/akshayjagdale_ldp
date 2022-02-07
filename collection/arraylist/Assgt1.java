package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Assgt1 {

	public static void main(String[] args)
	{
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(49);
		list.add(70);
		list.add(60);
		list.add(30);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j <list.size(); j++) {
				if(list.get(i)>list.get(j))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println("sorted list");
		System.out.println(list);
		

	}

}
