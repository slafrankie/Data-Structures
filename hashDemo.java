/*

	Shows an example of a hash table
	using a linked list

	Stephen LaFrankie
	4/26
*/


import java.util.*;		
import java.io.*;
class Test
{
	private int x, y;

	public Test()
	{
		x = y = 0;
	}
 	public Test(Test p)
 	{
		x = p.x;
		y = p.y;
	}
	//iterators
 	public Test(int x, int y)
 	{
		this.x = x;
		this.y=y;
	}

	//constructors
	public void setX()
	{
		this.x = x;
	}
	public void setY()
	{
		this.y = y;
	}

	public int getX()
	{
		return x;
	}
	public int getY()

	{
		return y;
	}

	public String toString()
	{
		return ("("+x+", "+y+")");
	}
	public void writeToFile(PrintWriter fout)
	 {
		 fout.println(toString());
	}
	public void readFromFile(Scanner fin)
	{
		x = fin.nextInt();
		y = fin.nextInt();
	}
}

class Node
{
	Test data;
	Node next;
	Node()
	{
		data = new Test();
		next = null;
	}
	Node(Test x)
	{
		data = new Test(x);
		next = null;
	}
	public String toString()
	{
		return data.toString();
	}

}
class testList
{
	Node header;
	public testList()
	{
		header = new Node();
	}
	public void prepend(Test x)
	{
		Node nd = new Node(x);
		nd.next = header.next;
		header.next = nd;
	}
	public void display()
	{
		Node nd = header.next;
		while(nd != null)
		{
			System.out.println(nd);
			nd = nd.next;
		}
	}
	public void append(Test x)
	{
		Node nd = new Node(x);
		//Find last node in list
		boolean done = false;
		Node i = header.next;
		while(! done)
		{
			i = i.next; //advance iterator
			if(i.next == null)
			{
				i.next = nd; // tack new node to end
				done = true;
			}
		}
	}
}

public class hashDemo
{
	public static void main(String[] args) throws FileNotFoundException
	{
		PointList L = new PointList();
		L.prepend(new Test(2,3));
		L.prepend(new Test(4,1));
		L.append(new Test(5,0));
		L.display();
	}
}

