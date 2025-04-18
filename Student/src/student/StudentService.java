package student;

import java.util.Arrays;

public class StudentService {
	       
	
	Student[] students = new Student[4];
	Student[] sortedStudents = new Student[students.length];
	int count; //등록 학생수

	{
		students[count++] = new Student(1, "개똥이", 60, 80, 90);
		students[count++] = new Student(2, "새똥이", 90, 30, 40);
		students[count++] = new Student(3, "말똥이", 10, 30, 60);
		students[count++] = new Student(4, "소똥이", 100, 100, 90);
		
		sortedStudents = students.clone(); //정렬만 수행하는거, 조회만 수행하는거 따로할거임  Arrays.copyOf(students, students.length)원래 이거했는데 대신clone집어넣음
		rank();
	}
	
	//입력: 학번
	//출력: 학생
	Student findBy(int no) {
		Student student = null;  //0값 부여하는것처럼 
		for(int i = 0; i < count; i++) {
			if(students[i].no == no) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	// 등록
	public void register() {
		System.out.println("등록 기능");
		// 학생 생성
		// 학번, 이름, 국어, 영어, 수학
		int no = StudentUtils.nextInt("학번 > ");
		
		Student s = findBy(no);
		
		if(s != null) {
			System.out.println("중복된 학번이 존재합니다.");
			return;
		}
		
		String name = StudentUtils.nextLine("이름 > ");
		int kor = StudentUtils.nextInt("국어 > ");
		int eng = StudentUtils.nextInt("영어 > ");
		int mat = StudentUtils.nextInt("수학 > ");
		
		
		if(students.length == count) {
			students = Arrays.copyOf(students, students.length * 2);
			
		}
		students[count++] = new Student(no, name, kor, eng, mat);
		sortedStudents = Arrays.copyOf(students, students.length); //정렬만 수행하는거, 조회만 수행하는거 따로할거임
		rank();
		
	}
		
	
	
	
	// 조회
	public void read() {
		System.out.println("조회 기능");
		print(students);
//		for(int i = 0 ; i < count ; i++) {
//			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].total() + ", " + students[i].avg());
		}
	public void readOrder() {
			System.out.println("석차순 조회 기능");
			print(sortedStudents);
		}
//		public String toString() {
//			return getClass().getSimpleName() + "[" + read + "]";
//		}
	public void print(Student[] stu) {
			for(int i=0; i < count; i++) {
				System.out.println(stu[i]);
			
		}
	}
	// 수정
	void modify() {
		System.out.println("수정 기능");
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = StudentUtils.nextInt("수정할 학생의 학번 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
		
		
		s.name = StudentUtils.nextLine("이름 > ");
		s.kor = StudentUtils.nextInt("국어 > ");
		s.eng = StudentUtils.nextInt("영어 > ");
		s.mat = StudentUtils.nextInt("수학 > ");
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
		
	}
	// 삭제
	void remove() {
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
		
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i+1, students, i, count-- - 1 - i);
				break;
			}
		}
		sortedStudents = Arrays.copyOf(students, students.length);
		rank();
	}

	
	//과목별 평균
	void allAvg() {
		//국어, 영어, 수학, 전체평균
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		//count 몇명의 학생을 기준으로 현재 평균이 얼마이다
		for(int i= 0; i < count; i++) {
			avgKor += students[i].kor;
			avgEng += students[i].eng;
			avgMat += students[i].mat;
		}
		avgKor /= (double)count;
		avgEng /= (double)count;  //반복된게 많음. 같은 라인보이면 메서드쓰거나 반복문 사용해서 줄이기
		avgMat /= (double)count;
		
		avgAll = (avgKor + avgEng + avgMat) / 3;
		
		System.out.println(count + "명의 학생 평균");
		System.out.println("국어 평균" + avgKor);
		System.out.println("영어 평균" + avgEng);
		System.out.println("수학 평균" + avgMat);
		System.out.println("전체 평균" + avgAll);
	}
	
	//석차
	void rank()	 {
		
		for(int i =0; i<count-1; i++) {
			
			int idx = i; //인덱스값초기화
			
			for(int j =1+i; j <count; j++) {  //비교해서 상호교환하는
				if(sortedStudents[idx].total() > sortedStudents[j].total()) {  //여기 부등호 바꾸면 내림차순이 됨.
					idx = j;  //여기까지 한번해서 탐색함. 
				}
			}	
			Student tmp = sortedStudents[i];
			sortedStudents[i] = sortedStudents[idx];
			sortedStudents[idx] = tmp;
			
		}
	}
	
	
//			sortedStudents = Arrays.copyOf(students, students.length); //정렬만 수행하는거, 조회만 수행하는거 따로할거임
//			rank();
//			System.out.println(i +1 +"회차 ::" + Arrays.toString(students));
//		}
		

//내가쓴거		System.out.println("과목별 평균점수");
//		int totkor = 0,toteng = 0,totmat = 0;
//		for(int i = 0; i<count; i++) {
//			totkor+=students[i].kor;
//			totkor+=students[i].eng;
//			totkor+=students[i].mat;
//			 //과목끼리 더하고(다른 학생들의 국어,영어,수학 점수를) 학생 수 count로 나눈다.? 
//			System.out.printf("%.2d", totkor);  //double로 나타내기?
//			System.out.printf("%.2d", toteng); //printf로 실수 출력
//			System.out.printf("%.2d", totmat);
//			}
//	배열 2개. 정렬은 데이터값이 변동 시에 등록,수정,삭제시점마다 
//	}
//	void rank() {
//		
//		//students.avg-? 학생들의 평균점수를 비교 하기
//		//for문으로 성적 비교  ?
//		//오름차순으로 정렬
//	
//	
//	// 1. 중복학번 학생 등록 방지(학번을 기준으로 학생의 존재 여부)
//	// 2. 점수당 평균값 출력 + @ 총평균
//	// 3. 석차 순 정렬--버블 정렬(대소비교)
//	// 4. Student 클래스의 toString 재정의
//	public static void main(String[] args) {
//		int[]arr = {5,3,2,1,4,7,8,6};  //최솟값 찾기. 인덱스 필요. 5번에 있는 인덱스와 값 교환
//		//선택 정렬은 앞쪽에 먼저 확정. 버블정렬은 뒤에 부터 확정
//		//탐색 n 최솟값 . 내림차순이면 최댓값 찾기
//		//1,3,2,5,4 >1회차. 0번 인덱스를 제외한 최솟값을 찾아서 1번인덱스에넣기
//		//1,2,3,5,4 >2회차
//		//1,2,3,5,4 >3회차
//		//1,2,3,4,5 >4회차 최솟값찾아서3번 인덱스에 넣기
//		for(int i =0; i<count-1; i++) {
//			
//			int idx = i; //인덱스값초기화
//			int min = arr[idx]; //min값 
//			for(int j =1+i; j <count; j++) {  //비교해서 상호교환하는
//				if(sortedStudents[idx] > sortedStudents[j]) {  //여기 부등호 바꾸면 내림차순이 됨.
//					idx = j;  //여기까지 한번해서 탐색함. 
//				}
//			}	
//			int tmp = sortedStudents[i];
//			sortedStudents[i] = sortedStudents[idx];
//			sortedStudents[idx] = tmp;
//			
//			System.out.println(i +1 +"회차 ::" + Arrays.toString(arr));
//		}
	}
	
