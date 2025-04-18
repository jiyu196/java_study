package student;

public class StudentMain {
	public static void main(String[] args) {
//		//사용자로부터 문자열 입력을 받고 싶음
//		String str = StudentUtils.nextLine("값을 입력하세요 > ");
//		System.out.println(str);
//		
//		//사용자로부터 숫자 입력을 받고 싶음
//		System.out.println(StudentUtils.nextInt("숫자를 입력하세요 > " ));
		
		StudentService service = new StudentService();
		System.out.println("================ 학생 점수 관리 프로그램 ==================");
		for(;;) {
			switch (StudentUtils.nextInt("1. 등록 2. 조회 3. 수정 4. 삭제 5. 과목별 평균 6. 석차순 조회 7. 종료")) {
			case 1:
				service.register();
				break;
				
				
			case 2:
				service.read();
				break;
				
			case 3:
				service.modify();
				break;
				
			case 4:
				service.remove();
				break;
				
			case 5:
				service.allAvg();
				break;
				
			case 6:
				service.readOrder();
				break;
			
			case 7:
				System.out.println("bye~!");
				return;
			default:
			
				break;
			}	
		}
		
//	case 2_1:
//		service.sum();
//		System.out.println("점수4개를 입력하세요 >");
//		break;
//		
//	case 2_2:
//		service.avg();
//		System.out.println("점수를 입력하세요 >");
//		break;
	
		
	}
}
