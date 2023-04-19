/*
	Program shows the basic appending
	of nodes into a binary tree and displays
	them in the proper order.
*/
public class laFrankieTree
{
  public static void main(String[] args)
  {
     Tree t = new Tree();
     t.addNode(2);
     t.addNode(35);
     t.addNode(4);
     t.addNode(43);
     t.addNode(3);
     t.displayPreorder();
  }
}
class Tree
{

  // Nested class used by class Tree:
  private class Node
  {
     private int n;
     private Node one, two;

     public Node()
     {
       n = 0;
       one = two = null;
     }
     public Node(int num)
     {
       n = num;
       one = null;
       two = null;
     }
     public void setOne(Node p)
     {
       one = p;
     }
     public void setTwo(Node p)
     {
       two = p;
     }
     public void displayPreorder()
     // Perform a preorder traversal to
     // display each node value
     {
       System.out.print(n + " ");
       if (one != null)
         one.displayPreorder();
       if (two != null)
         two.displayPreorder();
     }
     public void addLeaf(Node leaf)
	/*
		assigns the leaves of a tree to a specific spot
		depending on the circumstances listed below
		-If there is a spot open on the left, it is
		assigned there, and likewise on the right.
		-The last two are to help the program decide where
		to assign any remaining leaves
	*/
     {
       if (one == null)
         one = leaf;
       else if (two == null)
         two = leaf;
       else if (leaf.n % 2 == 0)
         one.addLeaf(leaf);
       else
         two.addLeaf(leaf);
     }
  }
	//tree class members
  private Node root;

  public Tree()
  {
    root = null;
  }

  public void addNode(int x)
  // Inserts 'x' as a leaf by
  {
    Node leaf = new Node(x);
    if (root == null)
      root = leaf;
    else
      root.addLeaf(leaf);
  }

  public void displayPreorder()//prints original order of inserted numbers
  {
    if (root != null)
      root.displayPreorder();
    System.out.println();
  }
}
