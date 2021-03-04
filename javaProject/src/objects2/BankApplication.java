package objects2;

import java.util.Scanner;

public class BankApplication {
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 >");

			int selectNo = scanner.nextInt();
			scanner.nextLine();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		Account2 userAccount = new Account2();
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");

		System.out.print("계좌번호:");
		userAccount.setAno(scanner.nextLine());

		System.out.print("계좌주:");
		userAccount.setOwner(scanner.nextLine());

		System.out.print("초기입금액:");
		userAccount.setBalance(scanner.nextInt());

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = userAccount;
				System.out.println(accountArray[i].getAno());
				break;
			}
		}
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + "   " 
								+ accountArray[i].getOwner() + "   "
								+ accountArray[i].getBalance());
			}
		}
	}

	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");

		System.out.println("계좌번호:");
		String ano = scanner.nextLine();
		
		Account2 userAccount = findAccount(ano);
		
		System.out.println("예금액:");
		int balance = scanner.nextInt();
		
		userAccount.setBalance("+",balance);
		
		System.out.println("결과: 예금이 성공되었습니다.");
	}

	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");

		System.out.println("계좌번호:");
		String ano = scanner.nextLine();
		Account2 userAccount = findAccount(ano);
		
		
		System.out.println("출금액:");
		int balance = scanner.nextInt();
		
		userAccount.setBalance("-",balance);
		
		System.out.println("결과: 출금이 성공되었습니다.");
	}

	// Account배열이 ano에서 동일한 Account 객체 찾기
	private static Account2 findAccount(String ano) {
		int index = 0 ;
		 for(int i = 0;i<accountArray.length;i++) {
			 if(accountArray[i]!=null&&accountArray[i].getAno().equals(ano)) {
				 index = i;
				 break;
			 }
		 }
		 return accountArray[index];
	 }
}
