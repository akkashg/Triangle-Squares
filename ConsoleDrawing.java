
import java.util.*;
public class ConsoleDrawing {

	public static void main(String []args) {
		// A main function to run the program.
		int c=Integer.parseInt(args[0]);
		int r=Integer.parseInt(args[1]);
		char b=args[2].charAt(0);
		System.out.println("----WELCOME TO MY CONSOLE DRAWING APP----");
		DrawingCanvas ob=new DrawingCanvas(c,r,b);
		
		ob.Canvas();
		ob.user();
		
	}

}
