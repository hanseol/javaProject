package objects2;

public class Member {

	private String customerId;
	private String customerName;
	private Book[] rentBooks = new Book[5];

	Member() {

	}

	public Member(String customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	

	void rent(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				System.out.println("대여 완료.");
				break;
			}
		}
	}

	void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getTitle().equals(book.getTitle())) {
				rentBooks[i] = null;
				System.out.println("반납 완료.");
				break;
			}
		}
	}

	public void getCustomerInfo() {
		System.out.println("회원id: "+getCustomerId());
		System.out.println("회원 이름: "+getCustomerName());
		for(int i=0;i<rentBooks.length;i++) {
			if(rentBooks[i]!=null) {
				System.out.println("대여중: " + rentBooks[i].getTitle());
			}
		}
	}
	public void getBookInfo() {
		System.out.print(getCustomerName() + "-");
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] != null) {
				System.out.print(rentBooks[i].getTitle());
				if (i != rentBooks.length - 1) {
					System.out.print("/");
				}
			}
		}
		System.out.println();
	}
	
}
