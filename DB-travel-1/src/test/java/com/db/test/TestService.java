package com.db.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.db.sys.po.SysLog;
import com.db.sys.server.SysLogService;
import com.db.sys.vo.PageObject;

@SpringBootTest
public class TestService {
	@Autowired
	private SysLogService sysLogService;
	
   @Test
   public void testService() {
	   String username="admin";
	   Integer pageCurrent=1;
	  PageObject<SysLog>  pageObject= sysLogService.findObjectByPage(username, pageCurrent);
	  System.out.println(pageObject);
   }
}
