package step5_02.file;


import java.util.Scanner;

//# 파일 컨트롤러[2단계] : ATM

public class FileEx07_문제 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int size = 5;
		int accsCnt = 0;
		int identifier = -1;
		
		String[] accs = new String[size];
		String[]  pws = new String[size];
		int[]  moneys = new int[size];
		
		String fileName = "atm.txt";
		
		while(true) {
			
			for (int i = 0; i < identifier; i++) {
				System.out.print("["+i+"번째"+"id]"+": " + accs[i] + " ");
				
			}
			System.out.println();
			
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				
				if(identifier == 5) {
					System.out.println("해당 배열의 요소가 꽉차있습니다.");
					break;
				}
				System.out.println("회원가입을 진행하겠습니다.");
				System.out.println("가입할 ID를 입력해주세요: ");
				String userID = scan.next();
				
				System.out.println("가입할 PW를 입력해주세요: ");
				String userPW = scan.next();
				
				
				identifier+=1;
				
				accs[identifier] = userID;
				pws[identifier] = userPW;
				
				if(identifier == 0) {
					identifier =1;
				}
				
				
				
				
			}
			else if (sel == 2) {
				System.out.println("삭제할 계정의 인덱스 번호를 선택해주세요: ");
				for (int i = 0; i < identifier; i++) {
					System.out.print("[ID]" + "[" + i + "] : " + accs[i]+ " " );
					
				}
				System.out.println();
				
				int idx = scan.nextInt();
				
				for (int i = idx; i < identifier; i++) {
					if(i == idx) {
						accs[idx] = accs[idx+1];
						pws[idx] = pws[idx+1];
						
					}
					if(idx == identifier-1) {
						identifier--;
					}
					
					else {
						identifier--;
					}
					
					
				}
				
				
				
				
			}
			
			else if (sel == 3) {
				if(identifier == -1) {
					System.out.println("로그인 후 이용해주세요");
					continue;
				}
				System.out.println("로그인을 진행하겠습니다.");
				System.out.println("ID를 입력해주세요: ");
				String userID = scan.next();
				System.out.println();
				
				System.out.println("PW를 입력해주세요: ");
				String userPW = scan.next();
				System.out.println();
				
				for (int i = 0; i < identifier; i++) {
					if(accs[i] == userID && pws[i] == userPW) {
						
						System.out.println(accs[i]+"님 환영합니다.");
						accsCnt = i;
					}
					
					else {
						System.out.println("ID와 PW를 다시 확인해주세요!");
						break;
					}
					
				}
				
				
				
				
			}
			else if (sel == 4) { // 로그아웃 
				identifier = -1;
				System.out.println("정상적으로 로그아웃 되었습니다.");
				break;
			} 
			else if (sel == 5) { // 입금
				if(identifier == -1) {
					System.out.println("로그인 후 이용해주세요");
					continue;
				}
				
				System.out.println("입급할 금액을 입력해주세요: ");
				int userMoney = scan.nextInt();
				
				moneys[accsCnt] = userMoney;
				
				
			}
			else if (sel == 6) {//출금
				if(identifier == -1) {
					System.out.println("로그인 후 이용해주세요.");
					continue;
				}
				
				System.out.println("출금할 금액을 입력해주세요");
				int userMoney = scan.nextInt();
				
				moneys[accsCnt] -= userMoney;
				
				System.out.println(accs[accsCnt]+"님의 현재 금액은 " + moneys[accsCnt]+"원 남았습니다.");
				
				
				
			} 
			else if (sel == 7) { // 이체 
				if(identifier == -1) {
					System.out.println("로그인 후 이용해주세요.");
					continue;
				}
				
				System.out.println("이체할 금액을 입력해주세요");
				int userMoney = scan.nextInt();
				
				moneys[accsCnt] += userMoney;
				
				System.out.println(accs[accsCnt]+"님의 현재 금액은 " + moneys[accsCnt]+"원 남았습니다.");
				
			} 
			else if (sel == 8) {}
			else if (sel == 9) {}
			else if (sel == 10) {}
			else if (sel == 0) {
				break;
			}
			
		}
		
	}
}
