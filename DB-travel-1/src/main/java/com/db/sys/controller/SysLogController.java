package com.db.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.db.sys.po.SysLog;
import com.db.sys.server.SysLogService;
import com.db.sys.vo.JsonResult;
import com.db.sys.vo.PageObject;

@Controller
@RequestMapping("/log/")
public class SysLogController {
	@Autowired
	private SysLogService sysLogService;

	public JsonResult doFindPageObjects(String username,Integer pageCurrent) {
		PageObject<SysLog> pageObjects = sysLogService.findObjectByPage(username, pageCurrent);
		
		return new JsonResult(pageObjects);
	}
	
	
	
}
