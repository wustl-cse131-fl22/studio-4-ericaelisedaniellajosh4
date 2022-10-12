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
		Scanner in = new Scanner(f); // making Scanner with a File

		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();

		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		if (shapeType.equals("rectangle")) {
			if (isFilled == true) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			} else {
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		if (shapeType.equals("ellipse")) {
			if (isFilled == true) {
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			} else {
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		if (shapeType.equals("triangle")) {
			double parameterFive = in.nextDouble();
			double parameterSix = in.nextDouble();
			double x[] = new double[3];
			x[0] = parameterOne;
			x[1] = parameterTwo;
			x[2] = parameterThree;
			double y[] = new double[3];
			y[0] = parameterFour;
			y[1] = parameterFive;
			y[2] = parameterSix;

			if (isFilled == true) {
				System.out.print(isFilled);
				StdDraw.filledPolygon(x, y);
			} else {
				StdDraw.polygon(x, y);
			}
		}

	}
}
