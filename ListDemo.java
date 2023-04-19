import java.util.*; //simple example of traversable linked list, throws exception if no file is found
import java.io.*;
class traversedList
{
	private int n;

	public traversedList()
	{
		n = 0;
	}
 	public traversedList(int num)
 	{
		n = num;
	}
	//iterators
 	public traversedList(traversedList s)
 	{
		n = s.n;
	}

	//constructors
	public void setN(int num)
	{
		n = num;
	}
	public int getN()
	{
		return n;
	}

	public String toString()
	{
		return "" + n;
	}
	public void writeToFile(PrintWriter fout)
	 {
		 fout.println(toString());
	}
	public void readFromFile(Scanner fin)
	{
		n = fin.nextInt();
	}
}

class Node
{
	traversedList data;
	Node next;
	Node()
	{
		data = new traversedList();
		next = null;
	}
	Node(traversedList x)
	{
		data = new traversedList(x);
		next = null;
	}
	public String toString()
	{
		return data.toString();
	}

}
class PointList
{
	Node header;

	public PointList()
	{
		header = new Node();
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

	public void prepend(traversedList x)
	{
		Node nd = new Node(x);
		nd.next = header.next;
		header.next = nd;
	}


	public void append(traversedList x)
	{
		Node nd = new Node(x);
		//Find last node in list
		boolean done = false;
		Node i = header.next;
		while(! done)
		{
			i = i.next;
			if(i.next == null)
				done = true;
		}
		i.next = nd; // tack new node to end



		//nd.next = header.next;
		//header.next = nd;
	}
	public void search(traversedList(x))
	{
		Node nd = new Node(x);
		while(nd != null)
		{
			System.out.print(nd.value);
			i = i.next;
		}
	}
}

public class ListDemo
{
	public static void main(String[] args) throws FileNotFoundException
	{
		PointList L = new PointList();
		L.prepend(new traversedList(2));
		L.prepend(new traversedList(4));
		L.prepend(new traversedList(5));
		L.prepend(new traversedList(9));
		L.append(new traversedList(1));
		L.display();
		L.search();
	}
}

