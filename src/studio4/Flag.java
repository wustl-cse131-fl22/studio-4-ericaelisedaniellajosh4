package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(1, 1, 1, 1);
		StdDraw.setPenColor(0, 255, 0);
		StdDraw.filledRectangle(.5, .5, 1, 0.3);
		StdDraw.setPenColor(100, 0, 100);
		StdDraw.filledRectangle(0, .5, 0.25, 0.15);
		StdDraw.setPenColor(200, 20, 0);
		StdDraw.filledRectangle(0.4, 0.5, 0.15, 0.15);
		StdDraw.setPenColor(255, 255, 0);
		StdDraw.filledRectangle(0.6, 0.5, 0.12, 0.15);
		StdDraw.setPenColor(150, 0, 150);
		StdDraw.filledRectangle(0.8, 0.5, 0.12, 0.15);
	}
}