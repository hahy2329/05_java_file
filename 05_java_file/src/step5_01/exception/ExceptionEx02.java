package step5_01.exception;

/*
 *  # finally 
 * 
 *  예외발생과 상관없이 무조건 실행할 명령어를 작성한다.
 *  주로 외부모듈과의 컨넥션을 종료할때 사용한다.
 *  
 * */


public class ExceptionEx02 {

	public static void main(String[] args) {
		
		try {
			
			int[] testArr = new int[5];
			System.out.println(testArr[0]);
			System.out.println(testArr[999]);
			System.out.println(testArr[0]/0);
			
			//오류코드 문장이 두 문장이 있을때 최초 오류문장만 실행하고 종료
			
		}catch(Exception e) {   //대장 호출(모든 오류를 받겠다!)
			System.out.println("오류 catch");
			
			
		}finally { //어디든지(정상,오류가나도) 무조건 실행!
			System.out.println("반드시 실행");
		}
		
		
		
		
		
		
		
		
	}

}
