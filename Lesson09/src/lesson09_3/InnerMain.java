package lesson09_3;

public class InnerMain {  //이름 충돌을 피하기 위해서 쓰는. 패키지로 회피후 내부클래스로 숨김
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner i;
		Outer.SInner si;
		i = outer. new Inner();
		si = new Outer.SInner();
	}
}   //객체지향 7장 개념이 제대로 들어있지않아서 잘 이해가 안가는거임

class Outer {
	class Inner {
		
	}
	
	static class SInner { //SInner- 앞에 Static붙은거
		
	}
	
	void m() {
		class local {
			
		}
	}
}


