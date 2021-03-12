package studentManagementPkg.model.impl;

import studentManagementPkg.control.StdManagementDAO;
import studentManagementPkg.model.Service;
import studentManagementPkg.model.StudentInfo;

public class ServiceImplement implements Service {
	
	StdManagementDAO dao = new StdManagementDAO();
	
	@Override
	public void enrollStu(StudentInfo stuInfo) {
		dao.enrollStd(stuInfo);
	}

	@Override
	public void updateStuInfo(StudentInfo stuInfo) {
		dao.updateStdInfo(stuInfo);
	}

	@Override
	public void insertScore(StudentInfo stuInfo) {
		dao.updateScore(stuInfo);
	}

	@Override
	public void updateScore(StudentInfo stuInfo) {
		dao.updateScore(stuInfo);
	}

	@Override
	public StudentInfo[] getStudentList() {
		return dao.selectStudentInfo();
	}


	@Override
	public StudentInfo listScore(int StuNo) {
		return dao.selectScore(StuNo);
	}

}
