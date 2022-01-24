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
		
		FrontController frontController = new FrontController();
	


		System.out.println("db연동 테스트 끝");

	}

}
