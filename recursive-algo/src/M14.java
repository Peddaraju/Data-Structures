class M14
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 5, 15, 1, 40};
		print(elements, elements.length - 1);		
	}
	static void print(int[] elements, int index)
	{
		System.out.println(elements[index --]);
		if(index == -1)
		{
			return;
		}
		print(elements, index);
	}
}
