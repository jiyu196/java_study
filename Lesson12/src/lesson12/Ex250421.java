package lesson12;

import java.util.Arrays;

public class Ex250421 {
	public static void main(String[] args) {
////		String[] url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=9f324k01".split("");
//		System.out.println(Arrays.toString(url));
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=9f324k01";
		
		
		System.out.println(url.substring(url.indexOf("h"), url.lastIndexOf("search.naver.com")));
		System.out.println(url.substring(url.indexOf("search"), url.lastIndexOf("/")));
		System.out.println(url.substring(url.indexOf("search.naver?")));
		
		System.out.println("===============================");
		String[] str  
		
//		String[] arr = url.split(", ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(">" + arr[i]);
//		}
		//프로토콜://도메인/파일명?쿼리스트링
		//1. 위의 항목에 맞춰 문자열 자르기
		
		//where=nexearch & sm=top_hty & fbm=0 & ie=utf8 & query=%EA%B3%A0%EC%96%91%EC%9D%B4 & ackey=9f324k01
		//쿼리스트링은 키1=값1&키2=값2 잘라서 보여주기
		//즉 값의 쌍은 &로 구분, 키와 값은 =로 구분
		
	
	}
}
