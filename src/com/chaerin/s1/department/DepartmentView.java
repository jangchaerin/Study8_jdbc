package com.chaerin.s1.department;

import java.util.List;

public class DepartmentView {
	// 모두출력
	public void view(DepartmentDTO departmentDTO) {

		System.out.print(departmentDTO.getDepartment_id() + "\t");
		System.out.print(departmentDTO.getDepartment_name() + "\t");
		System.out.print(departmentDTO.getManager_id() + "\t");
		System.out.println(departmentDTO.getLocation_id());
		System.out.println("==================================================");

	}

	public void view(List<DepartmentDTO> ar) {
		for (int i = 0; i < ar.size(); i++) {
			this.view(ar);

		}

	}
}
//로케이션 디파트먼트 무한반복
//임플로이즈도