package lesson08.shape;


public class Cylinder extends Shape implements Shape3D {
	
	Circle circle;
	int z;
	
	Cylinder() {
	}
	
	Cylinder(Circle circle, int z) {
		this.circle = circle;
		this.z = z;
	}
	public double area() {
		return circle.area() * 2 + circle.circum() * z;
	}
	public double volume() {
		return circle.area() * z;
		}
	}
	
//	int r,H;
//	
//	public Cylinder() {}
//	public Cylinder(int r, int H) {
//		this.r = r;
//		this.H = H;
//	}
//	public double surfaceArea() {
//		return ((2 * r * Math.PI)*2) + ((2 * Math.PI)*H);
////		return (area()*2) + (area()*H);
//		
//		
//		
//	}
//	public double volume() {
//		return (2 * r * Math.PI)*H;
//	}
//	@Override
//	public double circum() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public double area() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	


