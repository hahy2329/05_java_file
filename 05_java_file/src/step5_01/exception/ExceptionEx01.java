package step5_01.exception;

/*
 * 
 * # 예외 (Exception) 처리
 * 
 * 심각한 오류를 발생시킬수 있는 내용 자바와 외부 모듈(데이터베이스등)과의 컨넥션을 맺는 경우는 try , catch구문을 사용 한다.
 * 
 * try   : 오류가 나지 않을 경우 정상적으로 실행 될 명령어
 * catch : try{} 안의 명령어가 실행되는 중 오류가 발생할 경우 분기되는 명령어
 * 
 *  - try없이 catch구문이 단독으로 올 수 없고 , catch구문 없이 try구문이 단독으로 올 수 없다.
 * 
 * */

public class ExceptionEx01 {

	public static void main(String[] args) {
		
		
		try { // 예외처리로 발생할 수 있는 오류 문구를 가져와 사용자 지정을 하기
			
		
		
			int[] testArr = new int[5];
			
			
			//System.out.println(testArr[0]);
			
			//System.out.println(testArr[999]); 
			System.out.println(testArr[0] /0); 
			System.out.println("명령어");
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위초과 에러 catch");
			e.printStackTrace(); // printStackTrace는 과정, 경로란 뜻이다. 즉, 에러 과정도 같이 출력하란 뜻이다.
		}catch(ArithmeticException e) {
			System.out.println("연산 에러 catch");
			e.printStackTrace();
		}catch(Exception e) { //마스터 키(모든 걸 가지고 있음-> 모든 에러를 받음) 대장!
			System.out.println("모든 에러 catch");
			e.printStackTrace();
		}
		
		
	}

}
