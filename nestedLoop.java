/*
	Stephen LaFrankie
	Output: Program reads from an array with
	5 series of numbers into a forloop to calculate
	the average of "grades" for each element within
	that row
*/

public class nestedLoop
{
	public static void main(String[] args)
	{
		int i, j;
		double avg = 0;

		double[][] num = new double[5][];//array has 5 rows of elements
		num[0] = new double[10];//number of elements in each row
		num[1] = new double[2];
		num[2] = new double[6];
		num[3] = new double[5];
		num[4] = new double[2];

		num[0][0] = 100.0;
		num[0][1] = 85.5;
		num[0][2] = 25.4;
		num[0][3] = 30.3;
		num[0][4] = 75.5;
		num[0][5] = 100;
		num[0][6] = 88.7;
		num[0][7] = 95.6;
		num[0][8] = 97.8;
		num[0][9] = 55.8;

		num[1][0] = 50.0;
		num[1][1] = 60.0;

		num[2][0] = 70.5;
		num[2][1] = 90.0;
		num[2][2] = 99.9;
		num[2][3] = 65.0;
		num[2][4] = 44.5;
		num[2][5] = 82.3;

		num[3][0] = 39.5;
		num[3][1] = 68.4;
		num[3][2] = 96.9;
		num[3][3] = 100.0;
		num[3][4] = 28.7;

		num[4][0] = 55.9;
		num[4][1] = 100.0;

		for(i = 0; i < num.length; i++)//for loop for each row of the array
		{
			double sum = 0;
			for(j = 0; j < num[i].length; j++)//iterates the next element of each row in the array
			{
				sum += num[i][j];
			}
			avg = sum / j;
			System.out.printf("Average of class %d is: %.2f%n",i+1,avg);
		}
	}
}


