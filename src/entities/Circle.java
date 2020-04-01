package entities;

import entities.enums.Color;

public class Circle extends Shapes {
	private static final double pi = 3.1415;
	private Double radius;
	
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return pi * Math.pow(radius, 2);
	}
	
}
