package com.db.sys.server;

import com.db.sys.po.SysLog;
import com.db.sys.vo.PageObject;

public interface SysLogService {

	PageObject<SysLog> findObjectByPage(String username,Integer pageCurrent);
		
}
