package com.db.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.db.sys.dao.SysLogDao;
import com.db.sys.po.SysLog;

@SpringBootTest
public class TestDao {
	@Autowired
	private SysLogDao sysLogDao;
	
	@Test
	public void testdao() {
		String username="admin";
		Integer startIndex=0;
		Integer pageSize=3;
		List<SysLog> pageObjects = sysLogDao.findObjectByPage(username, startIndex, pageSize);
		System.out.println(pageObjects);
	}
	
	

}
