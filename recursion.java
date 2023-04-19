/*
	Author: Stephen LaFrankie
	Date: 2/13/18
	Purpose: Example of recursion by "emptying" a
	jar of coins coin by coin
*/



public class recursion
{
	public static void main(String[] args)
	{
		empty(10); //calls empty method while passing value of 10
}
	public static void empty(int Jar) // int Jar becomes assigned to value of 10
	{
		if(Jar > 0)	//if there are still values found, Jar will have another coin taken
		{
			System.out.println("There are " +Jar+ " coins in the jar.");
			empty(Jar - 1);
		}
		else //lets the user know the jar is empty
		{
			System.out.println("The jar is empty");
		}

	}
}

