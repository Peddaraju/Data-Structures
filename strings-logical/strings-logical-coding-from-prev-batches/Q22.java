
/*
Q22. swap two strings without temp.


*/
class Q22
{
	public static void main(String[] args) throws Exception 
	{
		String s1 = "abc";
		String s2 = "xyz";
		s1 = s1 + s2;   // s1 = abcxyz, s2 = xyz
		s2 = s1.substring(0, s1.length() - s2.length()); // s1 = abcxyz, s2 = abc
		s1 = s1.substring(s2.length());  //s1 = xyz, s2 = abc
		System.out.println(s1);
		System.out.println(s2);
	}
}
	 