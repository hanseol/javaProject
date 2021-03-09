package boardPkg.model;
//기능을 담당하는 service 인터페이스
public interface Service {
	public Board[] getBoardList(); //전체목록
	public Board getBoard(int boardNo); //1건 조회
	public void createBoard(Board board); //게시글 작성
	public void modifyBoard(Board board); //글 수정
	public void removeBoard(Board board); //글 삭제
}
