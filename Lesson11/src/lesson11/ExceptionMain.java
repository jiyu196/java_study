package lesson11;

public class ExceptionMain {
	public static void main(String[] args) {
		//try, catch, finally, throw, throws  5개 키워드
		int i = 1;
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(args[0]); //exception  
			System.out.println(4);
		}
		catch (NullPointertException e) {
		System.out.println(5); 
		}
		catch(ArithmeticException e) {
			System.out.println("a");
		}
		catch (RuntimeException e) {
			System.out.println("b");
		}
		finally {
			
		}
		System.out.println(6);
	}  //try catch예외처리
}
