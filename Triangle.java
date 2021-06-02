public class Triangle {

	public void Triangle(char b,char t,int r,int c,int a,int rot,String alg) {
	
		
		int al=0;
		if(alg.equals("middle"))
			al=(c-a)/2;
		else if(alg.equals("right"))
			al=c-a;
			
		
			
		if(rot>0)
			rot=rot%4;
		else if(rot<0)
		{
          int m;
          m=1-(rot/4);
          rot=(m*4+rot)%4;
		}
			
		if(rot==3)
		{
		int x=0+al;
		int y=a;
        
		for(int i=0;i<=r;i++)
		{
			for(int j=0;j<=c;j++)
			{
				if(i<=y && j>=x && (i-j)+al>=0)
				{
					System.out.print(t);
				}
				
				else
				{
					System.out.print(b);
				}
			}
			
			System.out.print('\n');
		}
		}
		
		else if(rot==0)
		{
			int x=0+al;
			int y=0;
	        
			for(int i=0;i<=r;i++)
			{
				for(int j=0;j<=c;j++)
				{
					if(i>=y && j>=x && (i+j)-al<=a)
					{
						System.out.print(t);
					}
					
					else
					{
						System.out.print(b);
					}
				}
				
				System.out.print('\n');
			}
		}
		
		else if(rot==1)
		{
			int x=a+al;
			int y=0;
	        
			for(int i=0;i<=r;i++)
			{
				for(int j=0;j<=c;j++)
				{
					if(i>=y && j<=x && (i-j)+al<=0)
					{
						System.out.print(t);
					}
					
					else
					{
						System.out.print(b);
					}
				}
				
				System.out.print('\n');
			}
		}
		else if(rot==2)
		{
			int x=a+al;
			int y=a;
	        
			for(int i=0;i<=r;i++)
			{
				for(int j=0;j<=c;j++)
				{
					if(i<=y && j<=x && (i+j)-al>=a)
					{
						System.out.print(t);
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

}
