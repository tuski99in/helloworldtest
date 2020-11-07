package recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0;i< 10;i++)
		{
			System.out.print(createFibonacci(i) + " ");
		}
	}
	public static int createFibonacci(int n)
	{
		if(n==0)
			return 0;
		else if(n==2 || n==1 )
			return 1;
		else
			return createFibonacci(n-2) + createFibonacci(n-1);
	}

}
