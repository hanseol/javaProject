package collections;

import java.util.ArrayList;
import java.util.List;

class Board{
	String subject;
	String content;
	String writer;

	public Board() {}
	
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "[subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
	

}

public class BoardExample {
	public static void main(String[] args) {
		List<Board> boards = new ArrayList<Board>();
		//boards = new LinkedList<>();
		Board b1 = new Board();
		b1.subject = "test";
		b1.content ="content";
		b1.writer = "user1";
		Board b2 = new Board("jaVa","very good","user2");
		Board b3 = new Board("jAvascript","good","user3");
		Board b4 = new Board("JAVAscript","good","user4");
		boards.add(b1);
		boards.add(b2);
		boards.add(b3);
		boards.add(b4);
		boards.add(new Board("scriptjava","good","user5"));
		
		boards.add(0,b4);
		
		for(int i = 0; i<boards.size();i++) {
			
			if(boards.get(i).subject.toLowerCase().indexOf("java")!=-1) {
				System.out.println(boards.get(i));
			}
		}
	}
}

