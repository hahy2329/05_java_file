package step5_02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//# 파일 로드하기 : 연습문제


public class FileEx05_풀이 {

	public static void main(String[] args) {
		
		
		// 4번 연습문제에서 작성된 테스트파일을 읽어들여와 아래 배열에 저장하시오.
		
		String[] names = new String[3];			// momk , megait , github
		String[] pws   = new String[3];			// 1111 , 2222   , 3333
		int[] moneys   = new int[3]; // 20000, 30000 , 40000
		
		int count = 0;
		String fileName = "fileTest02.txt";
		
		File file = new File(fileName); // 첫째, 파일 읽어오자.
		FileReader fr = null; // 파일 읽어오기 
		
		BufferedReader br = null; // 텍스트(글자) 읽어오기
		
		if(file.exists()) { //파일이 존재 한다면!
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				while(true) {
					if(count ==3) {
						break;
					}
					String data = br.readLine();
					String[] data1 = data.split("/");
					
					for (int i = 0; i < data1.length; i++) {
						if(i == 0) {
							names[count] = data1[i];
						}
						else if(i ==1 ) {
							pws[count] = data1[i];
						}
						
						else if(i ==2) {
							moneys[count] = Integer.parseInt(data1[i]);
						}
						
					}
					count++;
				}
				
				for (int i = 0; i < names.length; i++) {
					System.out.print(names[i]+ " ");
					
				}
				System.out.println();
				
				for (int i = 0; i < pws.length; i++) {
					System.out.print(pws[i] + " ");
					
				}
				System.out.println();
				for (int i = 0; i < moneys.length; i++) {
					System.out.print(moneys[i]+" ");
					
				}
				
			
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {br.close();} catch (IOException e) {e.printStackTrace();} 
				try {fr.close();} catch (IOException e) {e.printStackTrace();}
			}
		}
		
		
		

	}

}
