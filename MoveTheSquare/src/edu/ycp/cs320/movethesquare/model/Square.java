package edu.ycp.cs320.movethesquare.model;

public class Square {
	private double x, y, width, height;
	
	public Square() {
		
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}
	
	public void setWidth(double width) {
		this.width = 3 * width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double height) {
		this.height = 3 *height;
	}
	
	public double getHeight() {
		return height;
	}
}
