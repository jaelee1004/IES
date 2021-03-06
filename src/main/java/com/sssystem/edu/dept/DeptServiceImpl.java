package com.sssystem.edu.dept;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.sssystem.edu.dept.DeptService;
import com.sssystem.edu.dept.DeptVO;

public class DeptServiceImpl implements DeptService {
	@Autowired
	SqlSession session;
	
	@Override
	public List<DeptVO> selectAll() {
		List<DeptVO> deptList = null;
		return session.selectList("dept.selectAll");
	}

}
