class M21
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 40, 15, 40, 25, 5};   // 6 elements
		               //  0   1   2  3   4   5

		int sum = 0;
		for(int i = elements.length / 2; i < elements.length; i++)
		{
			sum += elements[i];
		}
		
		double avg = (double) sum / (elements.length / 2);

		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
	}
}
