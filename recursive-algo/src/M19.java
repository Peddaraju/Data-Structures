class M19 
{
	public static void main(String[] args) 
	{
		int[] elements = {1, 5, 2, 7, 4};
		int sum = findSum(elements, 0);
		System.out.println(sum);
	}
	static int findSum(int[] elements, int index)
	{
		if(index == elements.length - 1)
		{
			return elements[elements.length - 1];
		}
		return elements[index] + findSum(elements, ++index);
	}
}
