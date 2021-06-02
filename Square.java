
public class Square {

	public void Squares(char b, char s,int r,int c,int a,String alg) {
		// TODO Auto-generated method stub
		int x=a;
		int y=a;
		int al=0;
		if(alg.equals("middle"))
			al=(c-a)/2;
		else if(alg.equals("right"))
			al=(c-a);
		for(int i=0;i<=r;i++)
		{
			for(int j=0;j<=c;j++)
			{
				if(i<=y && j<=x+al && j>=al)
				{
					System.out.print(s);
				}
				
				else
				{
					System.out.print(b);
				}
			}
			
			System.out.print('\n');
		}
		
		
		
	}

}
