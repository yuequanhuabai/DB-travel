package com.db.sys.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JsonResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2442243053613679829L;
	private int state=1;
	private String message="ok";
	private Object data;
	
	//正常情况调用，封装查询结果
	public JsonResult(Object data) {
		this.data=data;
	}
	//异常情况调用
	public JsonResult(Throwable t) {
		this.state=0;
		this.message=t.getMessage();
	}
	
	
	
}
