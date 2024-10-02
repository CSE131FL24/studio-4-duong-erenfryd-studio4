package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(5,70,60);
		StdDraw.filledRectangle(0.5, 0.55, 0.35, 0.25);
		StdDraw.setPenColor(0,40,80);
		StdDraw.filledRectangle(0.5, 0.55, 0.34, 0.24);
		StdDraw.setPenColor(50,50,0);
		StdDraw.filledRectangle(.5, 0.5, .025, .15);
		
		double[] xTriangleOne = {0.35,0.65,0.50};
		double[] yTriangleOne = {0.5,0.5,0.70};
		double[] xTriangleTwo = {0.3,0.70,0.50};
		double[] yTriangleTwo = {0.40,0.40,0.60};
		
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		StdDraw.filledCircle(.5, 0.7, 0.04);
		StdDraw.setPenColor(5,80,5);
		StdDraw.filledPolygon(xTriangleOne, yTriangleOne);
		StdDraw.filledPolygon(xTriangleTwo, yTriangleTwo);
	}
}