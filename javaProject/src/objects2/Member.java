package objects2;

public class Member {

	private String customerId;
	private String customerName;
	private Book[] rentBooks = new Book[5];

	Member() {

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

	public Member(String customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	void rent(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}

	void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getTitle().equals(book.getTitle())) {
				rentBooks[i] = null;
				break;
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
