package step5_02.file;

import java.io.FileWriter;
import java.io.IOException;

//# 파일 저장하기 : 연습문제1

//23.02.07 14:07 ~ 14:11
public class FileEx03_풀이 {

	public static void main(String[] args) {
		
		// 김철수/20,이만수/30,이영희/40
		
		String[] names = {"김철수", "이만수", "이영희"};
		int[] ages     = {	   20,     30,     40};
		
		
		
		String fileName = "fileTest01.txt";
		
		String data = "";
		
		for (int i = 0; i < names.length; i++) {
			data += names[i];
			data += "/";
			data += ages[i]+"";
			if(i != names.length-1) {
				data += ",";
			}
			
		}
		
		System.out.println(data);
		
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter(fileName);
			fw.write(data);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

		
	}

}
