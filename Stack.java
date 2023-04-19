/*
	Stephen LaFrankie
	4/24/18
	Program: Displays a basic implementation of a Stack
	using integers. Program reads array, pushes each
	element, and pops/returns element from the top
	to be printed
	Prints: 50 40 30 20 10
*/

public class Stack
{
   private int maxSize;
   private long[] stackArray;
   private int top;
	//constructor class
   public Stack(int s)
   {
      maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
   }
   public void push(long j)//elements are added from array to stack
   {
      stackArray[++top] = j;
   }
   public long pop()
   {
      return stackArray[top--];//top is reduced by one as each element is popped
   }
   public long peek()
   {
      return stackArray[top];//displays full array
   }
   public boolean isEmpty()//method for checking if stack is empty
   {
      return (top == -1);
   }
   public boolean isFull()//method to check if stack is full
   {
      return (top == maxSize - 1);
   }
   public static void main(String[] args)
   {
      Stack theStack = new Stack(10);
      theStack.push(10);
      theStack.push(20);
      theStack.push(30);
      theStack.push(40);
      theStack.push(50);

      while (!theStack.isEmpty())
      {
         long value = theStack.pop();
         System.out.print(value);
         System.out.print(" ");
      }
      System.out.println("");
   }
}
