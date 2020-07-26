package com.db.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.db.sys.po.SysLog;

public interface SysLogDao {
	
	List<SysLog> findObjectByPage(
			String username,
			Integer startIndex,
			Integer pageSize);
	
	int CountRows(String username);
	
	

}
 