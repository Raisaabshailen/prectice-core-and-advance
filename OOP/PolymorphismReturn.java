package com.oop;

public class PolymorphismReturn {

	public static Shape getShape(int p) {

		if (p == 1) {
			return new Rectangle(5, 9);
		}

		if (p == 2) {
			return new Circle(5);
		}
		return null;

	}

	public static void main(String[] args) {

		Shape op = new Shape();

		PolymorphismReturn pr = new PolymorphismReturn();

		Rectangle r = (Rectangle) pr.getShape(2);

		System.out.println(r.area());
	}

}
