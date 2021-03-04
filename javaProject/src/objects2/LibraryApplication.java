package objects2;

import java.util.Scanner;

public class LibraryApplication {
	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		Member user = new Member("s1122", "김한설");
		boolean run = true;
		Scanner scn = new Scanner(System.in);

		while (run) {

			System.out.println(" ------------------------------------------------------- ");
			System.out.println(" 1)도서정보 등록 2)회원정보 조회 3)도서 대여 4)도서 반납 5)도서목록 조회 ");
			System.out.println(" ------------------------------------------------------- ");
			int menu = scn.nextInt();
			scn.nextLine();

			String title, author, publisher;
			int price;

			if (menu == 1) {
				Book bookInfo = new Book() ;
				System.out.println("<도서정보 입력> 제목 / 저자 / 출판사 / 가격 ");

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
						scn.nextLine();
						bookInfo.setPrice(price);

						bookList[i] = bookInfo;
						
						System.out.println(bookList[i].getAuthor());
						break;
					}
				}
			} else if (menu == 2) {
				user.getCustomerInfo();
			} else if (menu == 3) {
				System.out.print("대여할 책 제목을 입력하세요. >");
				title = scn.nextLine();
				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] != null) {
						if (bookList[i].getTitle().equals(title)) {
							user.rent(bookList[i]);
							break;
						}
					}else {
						System.out.println("도서관에 등록된 책이 없습니다.");
						break;
					}
				}
			} else if (menu == 4) {
				System.out.print("반납할 책 제목을 입력하세요. >");
				title = scn.nextLine();
				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] != null) {
						if (bookList[i].getTitle().equals(title)) {
							user.overdue(bookList[i]);
							break;
						}
					}
				}

			} else if (menu == 5) {
				int cnt = 0;
				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] != null) {
						bookList[i].getBookInfo();
						cnt++;
					}
				}
				if (cnt == 0) {
					System.out.println("등록된 도서 목록이 없습니다.");
				}
			} else {
				run = false;
			}
		}

	}
}
