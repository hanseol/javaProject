package studentManagementPkg.model;

public interface Service {
	public void enrollStu(StudentInfo stuInfo);//학생등록(학번,이름,나이,연락처)
	public void updateStuInfo(StudentInfo stuInfo);//학생정보수정: 학번/연락처만
	public void insertScore(StudentInfo stuInfo); //성적입력: 학번/이름 > 성적
	public StudentInfo listScore(int StuNo); //성적조회: 학번 -> 학번/이름/점수
	public void updateScore(StudentInfo stuInfo);//성적수정: 학번 -> 현재점수 70 > 90
	public StudentInfo[] getStudentList();//전체리스트 : 학번/이름/나이/연락처/점수
}
