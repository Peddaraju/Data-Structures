package com.lara;

public class BinarySearch {
	static int[] elements = {3, 5, 10, 21, 44, 55, 72, 89, 99, 120, 150, 192, 220, 250, 270, 290};
                          // 0  1   2   3   4  5    6  7   8    9   10    11   12   13   14   15
	
	public static void main(String[] args) {
		int start = 0, end = elements.length - 1;
		int searchingElement = 89;
		int location = binarySearch(start, end, searchingElement);
		if(location != -1)
		{
			System.out.println(searchingElement + " available @ :" + location);
		}
		else
		{
			System.out.println(searchingElement + " not available");
		}
	}
	static int binarySearch(int start, int end, int searchingElement)
	{
		if(end >= start)
		{
			int middleIndex = start + ((end - start) / 2);
			if(searchingElement == elements[middleIndex])
			{
				return middleIndex;
			}
			if(searchingElement < elements[middleIndex])
			{
				return binarySearch(start, middleIndex - 1, searchingElement);
			}
			else
			{
				return binarySearch(middleIndex + 1, end, searchingElement);
			}
		}		
		return -1;
	}
	
}
