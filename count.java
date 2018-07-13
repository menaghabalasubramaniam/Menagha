class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n=548;
		int sum=0;
		int c=0;
		while(n!=0){
			sum=n%10;
			c++;
			n=n/10;
		}
		System.out.println(c);
	}
}
