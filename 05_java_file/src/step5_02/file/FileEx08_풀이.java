package step5_02.file;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//# 파일 컨트롤러[3단계] : 장바구니

public class FileEx08_풀이 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",   "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		
		final int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		int identifier = 0;
		
		String fileName = "jang.txt";
		
		int count = 0;
		int log = -1;
		
		while (true) {
			
			System.out.println("[MEGA SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log!= -1) {
					System.out.println("현재 로그인 상태입니다.");
					continue;
				}
				System.out.println("로그인을 진행하겠습니다.");
				System.out.println("id를 입력해주세요: ");
				String userID = scan.next();
				System.out.println();
				
				System.out.println("PW를 입력해주세요: ");
				String userPW =scan.next();
				System.out.println();
				
				for (int i = 0; i < ids.length; i++) {
					if(ids[i].equals(userID) && pws[i].equals(userPW)) {
						identifier = i;
						log ++; //log는 로그인과 로그아웃을 진입할 때만 쓰일 겁니다.(즉,열쇠 역할)
					}
					
					else {
						
						continue;
					}
				}
				
				
				
				
				
			}
			else if (sel == 2) {//로그아웃
				log = -1;
				System.out.println("정상적으로 로그아웃 되었습니다.");
				continue;
				
				
			}
			else if (sel == 3) { //쇼핑
				if(log == -1) {
					System.out.println("로그인 후 쇼핑 이용이 가능합니다.");
					break;
				}
				
				while(true) {
					System.out.println("아이템을 선택해주세요 : ");
					for (int i = 0; i < items.length; i++) {
						System.out.print("["+(i+1)+"]" + items[i] );
					}
					System.out.println("[4].뒤로가기");
					
					int choice = scan.nextInt();
					
					if(choice == 4) {
						break;
					}
					
					jang[count][0] = identifier;
					jang[count][1] = choice;
					
					count++;

					
					
				}
				
				
				
				
			}
			else if (sel == 4) { //장바구니 목록
				
				if(log !=-1) {
					System.out.println("id : " + ids[identifier]);
					
				}
				
				
				int apple =0;
				int banana = 0;
				int berry = 0;
				for (int i = 0; i < jang.length; i++) {
					if(jang[i][0] ==identifier) {
						if(jang[i][1] == 1) {
							apple++;
						}
						else if(jang[i][1] == 2) {
							banana++;
						}
						else if(jang[i][1] == 3) {
							berry++;
						}
					}
				}
				
				System.out.println(items[0] + ": " + apple+"개");
				System.out.println(items[1] + ": " + banana+"개");
				System.out.println(items[2] + ": " + berry+"개");
				
				
				
				
				
			}
			else if (sel == 5) { // 저장하기
				
				String data = "";
				
				
				for (int i = 0; i <= log; i++) {
					data += jang[i][0];
					data += "/";
					data += jang[i][1];
					data += "\n";
				}
					
			
					
				FileWriter fw = null;
				
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {fw.close();}catch(IOException e) {e.printStackTrace();}
				}
			}
				
				
				
				
				
			
			else if (sel == 6) { //로드하기
				String data = "";
				File file = new File(fileName);
				
				if(file.exists()) {
					FileReader fr = null;
					BufferedReader br = null;
					
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						while(true) {
							String line = br.readLine();
							
							if(line == null) {
								break;
							}
							data +=line;
							data += "\n";
						}
						System.out.println(data);
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						try {br.close();}catch(IOException e) {e.printStackTrace();}
						try {fr.close();}catch(IOException e) {e.printStackTrace();}
					}
				}
				
				
			} 
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
}
