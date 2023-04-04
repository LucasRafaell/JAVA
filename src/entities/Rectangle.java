package entities;

import entites.enums.Color;

public class Rectangle extends AbstractShape {
	
	public double width;
	public double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return ((width + height) * 2);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
}
