package step5_02.file;

import java.io.FileWriter;
import java.io.IOException;

/*text file
 * 
 * I -> Input
 * O -> Output
 * 내가 작업한 걸 텍스트 파일에 집어넣고 다시 빼서 수정하고 다시 넣는 그런 작업.
 * 
 * 파일 입력(File Input)
 * 
 * 
 * 
 * 
 * */

public class FileEx01 {

	public static void main(String[] args) {
		
		// 파일이 생성되는 기본적인 위치는 현재 자바 파일과 같은 프로젝트 폴더이다.(위치변경가능)
		// 소스를 실행한 후 프로젝트를 선택 한 뒤 F5(새로고침)를 누르면 생성된 파일을 확인할 수 있다.
		
		FileWriter fw = null;
		String fileName = "ex01.txt";
		try { // 파일 입출력은 try , catch구문 없이 사용하지 못하도록 강제성을 부여해 놓았다.
			
			
			fw = new FileWriter(fileName); // 파일을 생성하는 기능의 객체 생성 
														// ppt,hwp,docx,txt등 파일 생성 가능
				
			
			// -write메서드를 통해서 파일에 데이터 입력이 가능하다.
			
			/*1) 문자열 데이터 형식만 가능하다.
			 *2) 개행기능이 없기 때문에 \n를 의도적으로 작성해야 한다.
			 *3) write메서드를 여러번 사용하지 않고
			 * 데이터를 미리 +=로 만들어 놓고 한번만 write 메서드를 사용하는 것을 권장한다.
			 * */
			
			fw.write("파일에 데이터 입력하기 연습1\n"); // 여기 있는 내용이 파일로 들어감 
			fw.write("파일에 데이터 입력하기 연습2\n"); // write == System.out.print()로 읽혀짐
			
			
			String data  =  "파일에 데이터 입력하기 연습3\n";
				   data += "파일에 데이터 입력하기 연습4\n";
				   data += "파일에 데이터 입력하기 연습5\n";
				   data += "파일에 데이터 입력하기 연습6\n";
				   data += "파일에 데이터 입력하기 연습7";
						   
			fw.write(data); //여러 문장을 변수 하나에 담아 저장 
			
			
			
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();} // 필수로 써줘야함!(안쓸시 파일이 안만들어짐) // 파일 객체 종료[중요]
		}
		

	}

}
