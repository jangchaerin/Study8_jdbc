package com.chaerin.s1.department;

import java.util.List;

public class DepartmentView {
	//모두출력
	public void view(List<DepartmentDTO> ar) {
		for(int i = 0 ; i<ar.size();i++ ) {
			System.out.print(ar.get(i).getDepartment_id()+"\t");
			System.out.print(ar.get(i).getDepartment_name()+"\t");
			System.out.print(ar.get(i).getManager_id()+"\t");
			System.out.println(ar.get(i).getLocation_id());
			System.out.println("==================================================");
		}
	}
}
