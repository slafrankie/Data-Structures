/*
	uses variation of dkeillist.java
   	by David Keil
*/
public class traversedList
{
   Node header;

   public traversedList()
   {
	   header = new Node();
   }
   public void append(int x)
   {
      Node i = header.get_next(),
           prev = null;
      while (i != null)
      {
         prev = i;
         i = i.get_next();
      }
      Node last = new Node(x);
      if (prev != null)
      {
         prev.set_next(last);
      }
      else
         header.set_next(last);
   	}
   public void display()
   {
      Node n = header.get_next();
      if (n == null)
         System.out.println("n is null");

      while (n != null)
      {
         System.out.println(n.get_data());
         n = n.get_next();
      }
   }
   public int sum()
   {
	   Node nd = header;
	   int sum = 0;

	   while(nd != null)
	   {
			sum +=nd.data;
			nd = nd.next;
	   }
		return sum;
   }
}
class Node
{
   traversedList data;
   Node next;
   Node()
   {
      next = null;
      data = new traversedList();
   }
   Node(traversedList x)
   {
      next = null;
  	  data = new traversedList(x);
   }
   public String toString()
   {
   	   return data.toString();
   }
   public void set_next(Node nd)
   { next = nd; }
   public Node get_next()
   { return next; }
   public int get_data()
   { return data; }



}