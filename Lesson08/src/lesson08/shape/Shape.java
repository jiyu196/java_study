package lesson08.shape;

public abstract class Shape {
	
	//원은 도형이다ㅇ,원기둥은 도형이다 ㅇ. 원은 원기둥이다x --포함으로가야함.
	
	
//	public abstract double circum(); //둘레는 필요없어서 빠져야 됨
	public abstract double area();   //추상 클래스
	
	public String toString() {
		return "넚이 : "+ area();
	}
	
//	public abstract double surfaceArea();
//	public abstract double volume();
	}

