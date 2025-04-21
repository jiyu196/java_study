package lesson08.shape;



public class Main {
	
		public static void main(String[] args) {
			Shape circle = new Circle(3);
//			System.out.println(circle.area());  //넓이
//			System.out.println(circle.circum());  //둘레
			
			Shape rect = new Rect(4,5);
//			System.out.println(rect.area());
//			System.out.println(rect.circum());
			
			Shape trian = new Trian(3,4,5,6);
			
			Cylinder cylinder = new Cylinder(new Circle(4),5);
			
			Shape[] shapes = {circle, rect, cylinder};
			
			for(int i = 0; i < shapes.length; i++) {
				System.out.println("==============="+ shapes[i].getClass().getSimpleName() + "=============");
				System.out.println("넓이 :"	+ shapes[i].area());
				if(shapes[i] instanceof Shape2D) { //2차원 도형일때
					System.out.println("둘레: " + ((Shape2D)shapes[i]).circum());
				}
				else if(shapes[i] instanceof Shape3D) {
					System.out.println("부피: " + ((Shape3D)shapes[i]).volume());
				}
////				
				
			}
		}
//			
//			Shape cylinder= new Cylinder(3,4);
//			
//			Shape hexahedron = new Hexahedron(3,4,5,6);
//			
//			Shape prism = new Prism(3,4,5);
//			
//			Shape[] shapes2 = {cylinder, hexahedron, prism};
//			
//			for(int i = 0; i <shapes2.length; i++) {
//				System.out.println("==============" + shapes2[i].getClass().getSimpleName() + "=============");
//				System.out.println(shapes2[i].surfaceArea());
//				System.out.println(shapes2[i].volume());
//			}
		
	}


