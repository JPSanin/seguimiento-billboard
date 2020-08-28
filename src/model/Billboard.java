package model;
import java.io.*;

public class Billboard implements Serializable {


	private static final long serialVersionUID = 1L;
	private double width;
	private double height;
	private boolean inUse;
	private String brand;

	public Billboard(double w, double h, boolean iu, String b ) {
		this.width=w;
		this.height=h;
		this.inUse=iu;
		this.brand=b;
	}
	
	
	public double calculateArea() {
		double area;
		area=width*height;
		return area;
	}


	public double getWidth() {
		return width;
	}


	public double getHeight() {
		return height;
	}


	public boolean isInUse() {
		return inUse;
	}


	public String getBrand() {
		return brand;
	}
	
	
	
	
	
}
