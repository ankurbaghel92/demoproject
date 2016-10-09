package coll;

import java.util.Comparator;
import java.util.TreeSet;


class mycomp implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2)
	{
		//Integer a = (int)i1;
		if(i1<i2)
		{
			return +1;
		}
		else if(i1>i2)
		{
		return -1;
		}
		else 
			return 0;
	}
}

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>(new mycomp());
		
		ts.add(10);
		ts.add(15);
		ts.add(0);
		ts.add(20);
		ts.add(5);
		System.out.println(ts);
		
	}

}
