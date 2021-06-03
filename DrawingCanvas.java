
//This class provides the UI
import java.util.*;
public class DrawingCanvas {

	int r=6;
    int c=10;
    char bg='-';
    Scanner sc=new Scanner(System.in);
    
    public DrawingCanvas (int ci,int ri,char b)
    {
    	
    	c=ci;
    	r=ri;
    	bg=b;
    }
    
    public void canvas_set()
    
    {
    	
    	System.out.print("Canvas width: ");
    	c=sc.nextInt();
    	System.out.print("Canvas height: ");
    	r=sc.nextInt();
    	System.out.print("Background character: ");
    	bg=sc.next().charAt(0);
    	System.out.println("Drawing canvas has been updated!\n");
    	Canvas();
    	user();
    }
    public void Canvas() {
 
    	
		System.out.printf("Current drawing canvas settings:\n- Width: %d\n- Height: %d\n- Background character: %s\n\n",c,r,bg);
    }
	public void user() {
		// TODO Auto-generated method stub
        
		System.out.println("Please select an option. Type 4 to exit.\n1. Draw triangles\n2. Draw squares\n3. Update drawing canvas settings\n4. Exit");
		int choice=sc.nextInt();
		if(choice==1)
			triangle();
		else if(choice==2)
			square();
		else if(choice==3)
			canvas_set();
		else if(choice==4)
		{
			System.out.println("Goodbye!");
		}
		else
		{
			System.out.println("Unsupported option. Please try again.");
			user();
		}
		

	}
	
	public void square()
	{
		String alg;
		
		
		System.out.println("Side length:");
		int a=sc.nextInt();
		while(a>r || a>c)
		{   
			System.out.printf("Error! The side length is too long (Current canvas size is %dx%d). Please try again.\n",c,r);
			System.out.println("Side length:");
			a=sc.nextInt();
		}
		System.out.println("Printing character:");
		char s=sc.next().charAt(0);
		System.out.println("Alignment (left, middle, right):");
		alg=sc.next();
		Square ob= new Square();
		ob.Squares(bg, s, r-1, c-1, a-1, alg);
		int zoom=1;
		String zi;
		while(zoom==1) {
		System.out.println("Type I/O to zoom in/out. Use other keys to continue.");
		zi=sc.next();
		if(zi.equals("I"))
		{
			if(a<r && a<c)
			{
			a++;
			}
			ob.Squares(bg, s, r-1, c-1, a-1, alg);
		}
		else if(zi.equals("O"))
		{
			if(a>1)
			{
			a--;
			}
		    ob.Squares(bg, s, r-1, c-1, a-1, alg);
		}
		else
		{
			zoom=0;
			System.out.println("Draw another square (Y/N)?");
		    String choice=sc.next();
		    while(!choice.equals("Y") && !choice.equals("N") )
		    {
		    	System.out.println("Unsupported option. Please try again!");
		    	choice=sc.next();
		    }
		    if(choice.equals("Y"))
		    	square();
		    else if(choice.equals("N"))
		    	user();
		}
		
		}
		
	}
	
	public void triangle() {
		String alg,ro;
		int rot=0;
		
		System.out.println("Side length:");
		int a=sc.nextInt();
		while(a>r || a>c)
		{
			System.out.printf("Error! The side length is too long (Current canvas size is %dx%d). Please try again.\n",c,r);
			System.out.println("Side length:");
			a=sc.nextInt();
		}
		System.out.println("Printing character:");
		char t=sc.next().charAt(0);
		System.out.println("Alignment (left, middle, right):");
		alg=sc.next();
		Triangle ob=new Triangle();
		ob.Triangle(bg,t,r-1,c-1,a-1,rot,alg);
		
		int rotations=1;
		while(rotations==1)
		{
		System.out.println("Type R/L to rotate clockwise/anti-clockwise. Use other keys to continue.");
		ro=sc.next();
		if(ro.equals("R"))
		{
			rot=rot+1;
			ob.Triangle(bg,t,r-1,c-1,a-1,rot,alg);
		}
		else if(ro.equals("L"))
		{
			rot=rot-1;
			ob.Triangle(bg,t,r-1,c-1,a-1,rot,alg);
		}
		else
		{   rotations=0;
			System.out.println("Draw another triangle (Y/N)?");
		    String choice=sc.next();
		    while(!choice.equals("Y") && !choice.equals("N") )
		    {
		    	System.out.println("Unsupported option. Please try again!");
		    	choice=sc.next();
		    }
		    if(choice.equals("Y"))
		    	triangle();
		    else if(choice.equals("N"))
		    	user();
		}
		    	
		}
	}

}
