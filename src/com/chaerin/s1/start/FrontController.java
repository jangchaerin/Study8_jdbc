package com.chaerin.s1.start;

import java.util.Scanner;

import com.chaerin.s1.department.DepartmentController;

public class FrontController {
	private Scanner sc;
	private DepartmentController departMentController;
//LocationController
	//Employeescontroller
	
	public FrontController() {
		sc=new Scanner(System.in);
		departMentController = new DepartmentController();
		//LOCATION
		//EMPLOYEES
		
		
	}
	public void mainStart() throws Exception{
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 직원 관리");
			System.out.println("2. 부서 관리");
			System.out.println("3. 지역 관리");
			System.out.println("4. 프로그램 종료");
			
			int select = sc.nextInt();
			switch(select) {
			case 1:
				//employeecontroller 메소드 호출
				break;
			case 2:
				//departmentcontroller 메소드 호출 (메인에서 하려고한거 여기서하는거임)
				departMentController.start();	//오류뜨는거는 예외처리 해줘야함 
				break;
			case 3: 
				//locationcontroller 메소드 호출
				break;
			default:
				flag=false;
			}
			
		}
	}

}
