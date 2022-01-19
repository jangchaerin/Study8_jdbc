package com.chaerin.s1.start;

import java.util.List;


import com.chaerin.s1.department.DepartmentDAO;
import com.chaerin.s1.department.DepartmentDTO;
import com.chaerin.s1.department.DepartmentView;
import com.chaerin.s1.location.LocationDAO;
import com.chaerin.s1.location.LocationDTO;
import com.chaerin.s1.location.LocationView;
import com.chaerin.s1.util.DBConnector;

public class StartMain {

	public static void main(String[] args) {
		System.out.println("db연동 테스트 시작");
		
//		DepartmentDAO departmentDAO = new DepartmentDAO();
//		DepartmentView departmentView = new DepartmentView();
//		
//		try {
//			List<DepartmentDTO> ar = departmentDAO.getList();
//			departmentView.view(ar);
//		}catch(Exception e){
//			e.printStackTrace();
//			
//		}
		
		
		LocationDAO locationDAO = new LocationDAO();
		LocationView locationView = new LocationView();
		
		try {
			List<LocationDTO> ar = locationDAO.getList();
			locationView.view(ar);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("db연동 테스트 끝");
		
	}

}
