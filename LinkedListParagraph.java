/*
 This program will implement a linked list that will receieve strings and in turn display a paragraph
 Author: Stephen LaFrankie
*/
 
 class wordNode
 {
 	String value;
 	
 	public wordNode(){value = "";}// no arguement constructor
 	public wordNode(String s){value = s;}//one arguement constructor
 	public wordNode(wordNode p){value = p.value;}
 	public void setValue(String s){value = s;}//mutator method
 	public String getValue(){return value;}//access method
 }
 
 class Node
 {
	wordNode word;
	Node next;
	Node()// no argument constructor (default)
	{
		word = new wordNode();
		next = null;
	}
	
	Node(wordNode x)//One arguement constructor 
	{
		word = new wordNode(x);
		next = null;
	}
	
	public String toString(){return word.getValue();}
 }
 
 class pointer
 {
 	Node cont;
 	public pointer()
 	{
 		cont = new Node();
 	}
 	
 	public void display()// method will display content of linked list 
	{
		Node n = cont.next;
		while(n != null)
		{
			System.out.print(n);
			n = n.next;
		}
		System.out.println();
	}
	
	public void prepend(wordNode x)// method will place node at start of linked list 
	{
		Node a = new Node(x);
		a.next = cont.next; 
		cont.next = a;
	}
	
	void search(wordNode x, Node he, String searchKey)//method will search for value in linked list
	{
		Node f = new Node(x);
		Node h = he.next;
		
		if((h.next).toString() == searchKey)
			System.out.println("Search Key Found");
		
		else 
			search(x, h.next, searchKey);
	}
	
	/*public void append(wordNode x)// method will place node at end of linked list 
	{
		Node p = new Node(x);
		Node o = header.next;
		boolean done = false;
		// find last node in the list
		while(! done)
		{
			o = o.next;
			if(o.next == null)// null pointer exception, I forgot how to fix
				done = true;
		}
		o.next = p;
	}*/
 }
 
 public class LinkedListParagraph
 {
 	public static void main(String[]args)
 	{
 		pointer toRun = new pointer();
 		Node test = new Node();
 		toRun.prepend(new wordNode("Paragraph "));
 		toRun.prepend(new wordNode("the "));
 		toRun.prepend(new wordNode("of "));
 		toRun.prepend(new wordNode("start "));
 		toRun.prepend(new wordNode("the "));
 		toRun.prepend(new wordNode("is "));
 		toRun.prepend(new wordNode("This "));
 		toRun.display();
 		
 		toRun.search(test.word, toRun.cont, "Paragraph ");
 	}
 }
 /*
Output of Program......
This is the start of the Paragraph 
Search Key Found

Process completed.
 
 */
  
