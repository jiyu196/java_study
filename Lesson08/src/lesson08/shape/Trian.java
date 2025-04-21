package lesson08.shape;


public class Trian extends Shape {
	
	int A,B,C,H;
	
	public Trian() {}
	public Trian(int A, int B, int C, int H) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.H = H;
	}
	public double circum() {
		return A + B + C;
	}
	public double area() {
		return (A * H)/2;
	}
	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
}

