/*

int rows = 8

11111111
2222222
333333
44444
5555
666
77
8





*/




class M17
{
	public static void main(String[] args) 
	{
		int rows = 8;
		for(int rowCount = 1; rowCount <= rows; rowCount ++)
		{
			for(int colCount = 1; colCount <= (rows + 1 - rowCount); colCount ++)
			{
				System.out.print(rowCount);
			}
			System.out.println();
		}
	}
}
