package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Hello
{
	
	public static <T> int linearSearch(List<T> list, Predicate<T> check)
	{
		for(int j = 0; j < list.size(); j++)
		{
			if (check.test(list.get(j)))
			{
				return j;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args)
	{
		check<Integer> firstMatch= new check<Integer>(12);
		check<String> secondMatch= new check<String>("yellow");
		check<String> noMatch= new check<String>("notacolour");
		List<Integer> intList= new ArrayList<Integer>();
		intList.add(12);
		intList.add(3);
		intList.add(10);
		List<String> stringList= new ArrayList<String>();
		stringList.add("red");
		stringList.add("blue");
		stringList.add("green");
		
		System.out.println(linearSearch(intList, firstMatch));
		System.out.println(linearSearch(stringList, secondMatch));
		System.out.println(linearSearch(stringList, noMatch));
	}
}
