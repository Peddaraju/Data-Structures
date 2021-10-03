

/*

	9 8 7 6 5
	8 7 6 5 4
	7 6 5 4 3
	6 5 4 3 2
	5 4 3 2 1

*/

class M10 
{
	public static void main(String[] args) 
	{
		for (int rows = 9; rows >= 5; rows --)
		{
			for(int cols = rows; cols >= (rows - 4); cols --)
			{
				System.out.print(cols);
			}
			System.out.println();
		}
	}
}
