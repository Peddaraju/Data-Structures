/*

1
11
111
1111
11111
111111

*/

class M25
{
	public static void main(String[] args) 
	{
		printRows(1);
	}
	static void printRows(int rows)
	{
		if(rows == 7)
		{
			return;
		}
		printCols(rows);
		System.out.println();
		printRows(++rows);
	}	
	static void printCols(int cols)
	{
		if(cols == 0)
		{
			return;
		}
		System.out.print(1);
		printCols(--cols);
	}
}
