package com.chaerin.s1.start;

import java.util.List;

import com.chaerin.s1.department.DepartmentDAO;
import com.chaerin.s1.department.DepartmentDTO;
import com.chaerin.s1.department.DepartmentView;
import com.chaerin.s1.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("db연동 테스트 시작");
		
		DepartmentDAO departmentDAO = new DepartmentDAO();
		DepartmentView departmentView = new DepartmentView();
		
		try {
			List<DepartmentDTO> ar = departmentDAO.getList();
			departmentView.view(ar);
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		System.out.println("db연동 테스트 끝");
		
	}

}
