package objects2;

public class Book {
	//private 책제목
	//책 저저, 출판사, 금액
	//get, set메소드
	
	String title;
	String author;
	String publisher;
	int price;
	
	Book(){
		
	}
	
	Book(String title, String author, String publisher, int price){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
