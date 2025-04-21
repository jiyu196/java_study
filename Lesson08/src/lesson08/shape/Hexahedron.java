package lesson08.shape;

public class Hexahedron extends Rect{
	
	int A,H,x,y;
	
	public Hexahedron() {}
	public Hexahedron(int A, int H, int x, int y ) {
		this.A = A;
		this.H = H;
		this.x = x;
		this.y = y;
	}
	public double surfaceArea() {
		return (A * H) + (x * y);
		
	}
	public double volume() {
		return ((A * H)/2) * H;
	}
	@Override
	public double circum() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
