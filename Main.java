/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    // functions
    
	static double sin(double n) {
	    return Math.sin(n);
	}
	static double cos(double n) {
	    return Math.cos(n);
	}
	static double tan(double n) {
	    return Math.cos(n);
	}
	static double normdist(double i, double mu, double sd) {
	    return (1 / (sd * Math.sqrt(2 * Math.PI))) * Math.exp(-1 * ((i - mu) * (i - mu)) / (2 * sd * sd));
	}
	static double log(double n) {
	    return Math.log(n);
	}
	static double sqrt(double n) {
	    return Math.sqrt(n);
	}
	public static void main(String[] args) {
	    
	    double e = Math.exp(1);
	    
	    Scanner sc = new Scanner(System.in);
	
		System.out.print("First Bound: ");
		double firstBound = sc.nextDouble();
		System.out.print("Second Bound: ");
		double endBound = sc.nextDouble();
		
		System.out.println("=============");
		
		double intervalNum = 2147483646;
		
		
		System.out.println("Calculating...");

		double lengths = (endBound - firstBound) / intervalNum;
		
		double adder = 0;
		for (double x = firstBound; x < endBound; x += lengths) {
		    
		    //      TYPE YOUR FUNCTION HERE      //
		    
		            double func = 1;
		    
		    //      TYPE YOUR FUNCTION HERE       //
		    
		    double rect = func * lengths;
		    adder += rect;
		}
		
		System.out.format("%.3f", adder);
		System.out.println();
		System.out.println("=============");
		
	}
}


