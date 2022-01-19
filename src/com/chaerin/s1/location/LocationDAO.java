package com.chaerin.s1.location;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.chaerin.s1.util.DBConnector;


public class LocationDAO {
	//DAO -DB에 접근하는애들
	private DBConnector dbConnector;
	
	public LocationDAO() {
		dbConnector = new DBConnector();
	}
	
	public List<LocationDTO> getList() throws Exception{
		ArrayList<LocationDTO> ar = new ArrayList<>();
		
		//1. db에 로그인
		Connection con = dbConnector.getConnect();
		
		//2. sql Query문 작성
		String sql = "SELECT * FROM LOCATIONS";
		
		//3. Query문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ? 세팅 생략가능
		
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		//6. 자원 해제
		while(rs.next()) {
			LocationDTO locationDTO = new LocationDTO();
			
			locationDTO.setStreet_address(rs.getString("street_address"));
			locationDTO.setLocation_id(rs.getInt("location_id"));
			locationDTO.setPostal_code(rs.getString("postal_code"));
			locationDTO.setCity(rs.getString("city"));
			locationDTO.setState_province(rs.getString("state_province"));
			locationDTO.setCountry_id(rs.getString("country_id"));
			
			
			ar.add(locationDTO);
		}
		rs.close();
		st.close();
		con.close();
		
		return ar;
		
	}

}
