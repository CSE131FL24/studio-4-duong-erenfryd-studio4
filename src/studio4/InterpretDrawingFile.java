package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		double xCord = in.nextDouble();
		double yCord = in.nextDouble();
		double xThick = in.nextDouble();
		double yThick = in.nextDouble();
		//double xVert = in.nextDouble();
		//double yVert = in.nextDouble();
		
		if (shape=="rectangle") {
		StdDraw.setPenColor(red,green,blue);
			if (filled==true) {
			StdDraw.filledRectangle(xCord, yCord, xThick, yThick);
			}
			else {
			StdDraw.rectangle(xCord, yCord, xThick, yThick);
			}
		}
		
		if (shape=="ellipse") {
			StdDraw.setPenColor(red,green,blue);
			if (filled==true) {
				StdDraw.filledEllipse(xCord, yCord, xThick, yThick);
			}
			else {
				StdDraw.ellipse(xCord, yCord, xThick, yThick);
				}
			}
		
		if (shape=="triangle") {
			StdDraw.setPenColor(red,green,blue);
			//double[] x = {xCord,xThick,xVert};
			//double[] y = {yCord,yThick,yVert};
			if (filled==true) {
				//StdDraw.filledPolygon(x, y);
			}
			else {
				//StdDraw.polygon(x, y);
				}
			}
	}	
}
