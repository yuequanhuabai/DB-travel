package com.db.sys.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db.sys.common.exception.ServiceException;
import com.db.sys.dao.SysLogDao;
import com.db.sys.po.SysLog;
import com.db.sys.vo.PageObject;

@Service
public class SysLogServiceImpl implements SysLogService{
	@Autowired
	SysLogDao sysLogDao;

	@Override
	public PageObject<SysLog> findObjectByPage(String username, Integer pageCurrent) {
		//验证传入参数
		if(pageCurrent==null|| pageCurrent<1) {
			throw new IllegalArgumentException("请输入一个合理的当前页码值！！！");
		}
		
		int rowCount = sysLogDao.CountRows(username);
		//验证查询参数
		if(rowCount==0) {
			throw new ServiceException("系统没有找到对应的记录");
		}
		
		int pageSize=3;	
		int pageCount=(rowCount-1)/pageSize+1;
		int startIndex=(pageCount-1)*pageSize;
		
		List<SysLog> records = sysLogDao.findObjectByPage(username, startIndex, pageSize);
		PageObject<SysLog> pageObjects=new PageObject<>();
		pageObjects.setRowCount(rowCount);
		pageObjects.setPageSize(pageSize);
		pageObjects.setPageCount(pageCount);
		pageObjects.setPageCurrent(pageCurrent);
		pageObjects.setRecords(records);
		
		return pageObjects;
	}

}
