package collection.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Assgt1 {

	public static void main(String[] args)
	{
		ArrayList<String> arraList=new ArrayList<String>();
		arraList.add("akshay");
		arraList.add("santosh");
		arraList.add("jagdale");
		System.out.println(arraList);
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.addAll(arraList);
		linkedList.add("champ");
		linkedList.add(0, "playername");
		System.out.println(linkedList);
	}

}
