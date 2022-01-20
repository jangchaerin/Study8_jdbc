package com.chaerin.s1.department;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.chaerin.s1.util.DBConnector;

public class DepartmentDAO {
	//DAO : Data Access Object DB에 접속

	private DBConnector dbConnector;
	
	public DepartmentDAO() {
		dbConnector = new DBConnector();
	}
	//부서번호로 조회
	
	public DepartmentDTO getOne(int department_id) throws Exception{
		 DepartmentDTO departmentDTO = null;
		
		//1. DB에 로그인
		Connection con = dbConnector.getConnect();
		//2. SQL Query문 작성
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ? ";
		//3. Query문 미리전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 값 세팅(없으면 생략)
		//st.set 데이터 타입 (int index, 값) 
		//index는 ?의 순서번호
		//오라클은 0번이 아니라 1번부터 시작
		st.setInt(1, department_id); // 1번이라는 것은 몇번째 물음표냐? 라는 뜻 지금은 물음표한개
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			departmentDTO = new DepartmentDTO();
			
			departmentDTO.setDepartment_id(rs.getInt("department_id"));
			departmentDTO.setDepartment_name(rs.getString("department_name"));
			departmentDTO.setManager_id(rs.getInt("manager_id"));
			departmentDTO.setLocation_id(rs.getInt("location_id"));
		}
		//6. 자원 해제
		rs.close();
		st.close();
		con.close();
	
		return departmentDTO;
	}
	
	//LIST는 전체조회
	public List<DepartmentDTO> getList() throws Exception {
		ArrayList<DepartmentDTO> ar = new ArrayList<>();
			
		//SELECT * FROM DEPARTMENTS;
		//1. DB로그인
		Connection  con = dbConnector.getConnect();
		
		//2. SQL Query 문 작성
		//자바에서는 ;제외 알아서 자동으로 붙여줌
		String sql = "SELECT * FROM DEPARTMENTS"; //내가 보내고 싶은 쿠ㅓ리문을 문자열로 작성
		
		//3. 작성한 SQL Query 미리전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값을 세팅, 없으면 통과
		
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		//cursor가 한줄 읽는 메소드 next() 리턴은 데이터가 있으면 true, 없으면 false
		while(rs.next()) {
			DepartmentDTO departmentDTO = new DepartmentDTO();
//			String name = rs.getString("department_name");
//			departmentDTO.setDepartment_name(name);				//40번줄이랑 똑같은 말
			
			departmentDTO.setDepartment_name(rs.getString("department_name"));
			departmentDTO.setDepartment_id(rs.getInt("department_id"));
			departmentDTO.setManager_id(rs.getInt("manager_id"));
			departmentDTO.setLocation_id(rs.getInt("location_id"));
			
			//arraylist
			ar.add(departmentDTO);
		}
		
		//6. 외부 연결 해제
		//   연결된 순서 역순
		rs.close();
		st.close();
		con.close();
			
	return ar;
	}
}
