/*
	Uses ideas from Dr. Keil's sample

	Stephen LaFrankie

	Demonstrates the implementation
	of a collection using file maintenance
	and arrays
*/

public class collecBui
{
	private int num1, num2;

	public collection()
	{
		num1 = num2 = 0;
	}
	public Point(int num1, int num2)
	{
		this.num1 = num1; this.num2=num2;
	}

	public setNum1(int num1)
	{
		this.num1 = num1;
	}
	public setNum2(int num2)
	{
		this.num2 = num2;
	}

	public int getNum1()
	{
		return num1;
	}
	public int getNum2()
	{
		return num2;
	}

	public String toString()
	{return (num1+","+num2);}
	public void writeToFile(PrintWriter fout)
	{fout.println(toString());}
	public boolean retrieve(Scanner fin)
	{
		if(fin.hasNext())
		{
			num1=fin.nextInt();
			num2=fin.nextInt();
			return true;
		}
		else return false;
	}
}
class creCol
//array of objects
{
	private collecBui[] p;
	private int c; //count

	public collection(int size) //constructor method
	{
		n = 0;
		p = new collecBui[size];

		for(int i = 0; i < size; i++)
		{
			p[i] = new collecBui();
		}
	}
	public void display()	//shows user the value at each position
	{
		for(int i = 0; i <n; i++)
		{
			System.out.print("(" + p[i].toString() + ")");
		}
	}
	public void fetch(String fName) throws FileNotFoundException //reads a file into the array
	{
		System.out.println("Currently processing "+fName);
		try{
			FileReader r = new FileReader(fName);
			Scanner key = new Scanner(reader);
			while(p[n].retrieve(key))
			{
				n++;
			}
			key.close();
			System.out.println(n + "spots found");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File spots.txt not found");
		}
	}

	public void keep(String fName)throws FileNotFoundException //saves the contents to the file "fName"
	{
		System.out.println("Saving "+fName);
		PrintWriter text = new PrintWriter("update.txt");
		for(int i = 0; i < n; i++)
		{
			text.println(p[i].toString());
		}
		text.close();
	}
}

public class collection
{
	public static void main(String[] args)throws FileNotFoundException
	{
		creCol coll = new creCol(100);
		coll.fetch(spot.txt);
		coll.display();
	}
}

