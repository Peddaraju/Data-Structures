class M22
{
	public static void main(String[] args) 
	{
		int[] elements = {60, 40, 15, 40, 125, 5};   // 6 elements
		               //  0   1   2  3   4   5

		int leftSum = 0;		
		for(int i = 0; i < elements.length / 2; i++)
		{
			leftSum += elements[i];
		}
		
		int rightSum = 0;
		for(int i = elements.length / 2; i < elements.length; i++)
		{
			rightSum += elements[i];
		}
		
		double leftAvg = (double) leftSum / (elements.length / 2);
		double rightAvg = (double) rightSum / (elements.length / 2);

		System.out.println(leftAvg < rightAvg ? "bigger elements in the 2nd half" : "bigger elements in the 1st half");
	}
}
