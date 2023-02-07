package step5_01.exception;

/*
 * 
 * # 예외 (Exception) 처리 throws
 * 
 *  - try ~ catch 와 같이 예외를 처리하나 상위 메서드로 처리를 뒤로 미룬다.
 * 
 * */

//throws는 얇게 알아둘것! 

public class ExceptionEx03 {

	public static void main(String[] args) throws Exception { // main 프로그램 실행중 오류가 발생한다? 그럼 오류를 던지겠다!라는 의미(폭탄(오류)을 누군가에게 던진다는 것)
		
		int[] testArr = new int[5];
		System.out.println(testArr[999]);
		System.out.println(testArr[0]/0);
		
	}

}
