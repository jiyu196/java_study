package lesson08.shape;


public class Prism extends Trian{
	
	int x,y,H;
	
	public Prism() {}
	public Prism(int H, int x, int y ) {
		
		this.H = H;
		this.x = x;
		this.y = y;
	}
	public double surfaceArea() {
		return (2*x*y) + (2*x*H) + (2*y*H);
		
	}
	public double volume() {
		return x * y * H;
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

