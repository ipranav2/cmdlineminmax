class CommandLineMinMax
{
	public static void main(String S[])
	{
		int max=0;
		for(int i=0; i<S.length;i++)
		{	
			int x=Integer.parseInt(S[i]);	
			if(x>max)
			max=x;
		}
		int min=0;
		for(int j=0; j<S.length;j++)	
		{
			int x=Integer.parseInt(S[j]);
			if(x<min)
			min=x;
		}
	System.out.println("maximum term is = "+max);
	System.out.println("minimum term is = "+min);

	}
}