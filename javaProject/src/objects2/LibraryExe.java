package objects2;

public class LibraryExe {
	public static void main(String[] args) {
		Book book1 = new Book("JAVA","저자1","출판사1",10000);
		Book book2 = new Book("HTML","저자2","출판사2",8000);
		Book book3 = new Book("ORACLE DB","저자3","출판사3",20000);
		Book book4 = new Book("CSS","저자4","출판사4",9000);
		Book book5 = new Book("JAVASCRIPT","저자5","출판사5",7000);
		
		Member mem1 = new Member("s111","김한설");
		Member mem2 = new Member("a222","김현경");
		
		mem1.rent(book1);
		mem1.rent(book2);
		mem1.rent(book5);
		//mem1.overdue(book2);
		
		mem1.getBookInfo();
		
		
		mem2.rent(book1);
		mem2.rent(book4);
		mem2.overdue(book1);
		
		mem2.getBookInfo();
	}
}
