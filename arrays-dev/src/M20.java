class M20
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 40, 15, 40, 25, 5};   // 6 elements
		               //  0   1   2  3   4   5

		int sum = 0;
		for(int i = 0; i < elements.length / 2; i++)
		{
			sum += elements[i];
		}
		
		double avg = (double) sum / (elements.length / 2);

		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
	}
}
