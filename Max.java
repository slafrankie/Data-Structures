/*
	Reads file into array, searches
	file for a key.
	Stephen LaFrankie
	1/30/18
*/
import java.util.*;
import java.io.*;

public class Max
{
	public static void main(String[] args)throws FileNotFoundException
	{
		Scanner key = new Scanner(System.in);
		//Get the numbers from the file
		String numbers = "myArr.java";
		int[] A = readFile(numbers);
		display(A);

		System.out.println("Max is " +max2(A, 1, A.length));
	}
	public static int[] union(int[] A, int[] B)
	//returns union of sets A and B
	{
	int[] y = new int[A.length + B.length];
	//y <- A
	for(int i = 0; i < A.length; i++)
		y[i] = A[i];
	for(int j = 0; j < B.length; j++)
		y[A.length+ j] = B[j];
	y = removeDups(y);
	return y;
	}

	public static int max(int[] A)
	{
		int y = A[0];
		for(int i = 0; i < A.length; i++)
			if(A[i] > y);
				y = A[i];
		return y;
	}
	public static int[] max2(int[] A, int first, int last)
	{
		if (first == last)
			return A[1];
		else
		{
			int z = max2(A, first+1, last);
			return(A[first] > z ? A[first] : z);
		}
	}
}