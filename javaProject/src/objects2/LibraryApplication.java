package objects2;

import java.util.Scanner;

public class LibraryApplication {
	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		Member user = new Member();
		boolean run = true;
		Scanner scn = new Scanner(System.in);

		System.out.println("1. 도서정보 등록 2. 회원정보 조회 3. 도서 대여 4. 도서 반납 5. 도서 목록");
		int menu = scn.nextInt();
		scn.nextLine();
		
		String title, author, publisher;
		int price;
		
		while (run) {
			if (menu == 1) {
				
				Book bookInfo = new Book() ;
				for (int i = 0; i < bookList.length; i++) {
					System.out.println("책 제목, 저자, 출판사, 가격 입력");
					if (bookList[i] == null) {
						title = scn.nextLine();
						bookInfo.setTitle(title);
						
						author = scn.nextLine();
						bookInfo.setAuthor(author);
						
						publisher = scn.nextLine();
						bookInfo.setPublisher(publisher);
						
						price = scn.nextInt();
						bookInfo.setPrice(price);
						
						bookList[i] = bookInfo;
						
						System.out.println(bookList[i].getAuthor());
						break;
					}
				}
			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 5) {

			} else {
				run = false;
			}
		}

	}
}
