package facededesignpattern;

import facededesignpattern.patterns.ShapeMaker;

public class Runner {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();

	}

}
