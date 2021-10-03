//selection sort
import java.util.Arrays;
class M60
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};   
		//                0   1   2  3    4   5   6   7   8  9   10  11  
		System.out.println("initial content:" + Arrays.toString(elements));
		
		for(int i = 0; i < elements.length; i++)
		{
			int minValueIndex = i;
			for(int j = i + 1; j < elements.length; j++)
			{
				if(elements[j] < elements[minValueIndex])
				{
					minValueIndex = j;
				}
			}
			int temp = elements[i];
			elements[i] = elements[minValueIndex];
			elements[minValueIndex] = temp;
		}
		System.out.println("final content:" + Arrays.toString(elements));
	}
}
/*
				 {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};   
//                0   1   2  3    4   5   6   7   8  9   10  11  

i = 0 (0 to 11), length = 12
----------------------------
minValueIndex = 0
    j = 1 ( 1 to 11)
	---------------
		initial => minValueIndex = 0;
		after   => minValueIndex = 0;
    j = 2 ( 1 to 11)
	---------------
		initial => minValueIndex = 0;
		after   => minValueIndex = 2;
    j = 3 ( 1 to 11)
	---------------
		initial => minValueIndex = 2;
		after   => minValueIndex = 2;

    j = 4 ( 1 to 11)
	---------------
		initial => minValueIndex = 2;
		after   => minValueIndex = 2;
		.......
		.......
		.......
		.......
		.......
    j = 11 ( 1 to 11)
	---------------
		initial => minValueIndex = 2;
		after   => minValueIndex = 2;
				 {4, 40, 10, 50, 125, 5, 800, 6, 60, 9, 100, 12};   
//                0   1   2  3    4   5   6   7   8  9   10  11  
i = 1, length = 12
-------------------
minValueIndex = 1
    j = 2 (2 to 11)
	--------------
		initial => minValueIndex = 1;
		after   => minValueIndex = 2;

    j = 3 (2 to 11)
	--------------
		initial => minValueIndex = 2;
		after   => minValueIndex = 2;
    j = 4 (2 to 11)
	--------------
		initial => minValueIndex = 2;
		after   => minValueIndex = 2;

    j = 5 (2 to 11)
	--------------
		initial => minValueIndex = 2;
		after   => minValueIndex = 5;

    j = 6 (2 to 11)
	--------------
		initial => minValueIndex = 2;
		after   => minValueIndex = 5;

    j = 7 (2 to 11)
	--------------
		initial => minValueIndex = 5;
		after   => minValueIndex = 5;

	.........
	.........
	.........
	.........
	.........
    j = 11 (2 to 11)
	--------------
		initial => minValueIndex = 5;
		after   => minValueIndex = 5;
				 {4, 5, 10, 50, 125, 40, 800, 6, 60, 9, 100, 12};   
//                0   1   2  3    4   5   6   7   8  9   10  11  




*/












