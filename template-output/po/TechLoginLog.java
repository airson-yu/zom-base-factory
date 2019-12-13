package com.zom.common.dao.po;

import java.util.Date;
import java.math.BigDecimal;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;

/**
 * @author yuronghua-airson
 * @description PO: TechLoginLog
 * @template 2019.08.02 v11.0
 * @organization Zero One More, Inc. http://www.01more.com
 * @remark 登录日志表
 * @time 2019-12-13 17:56:27
 */
@Data
public class TechLoginLog {

	/**
	 * 
	 */
	private Long id;
	
	/**
	 * 用户ID
	 */
	private Long userId;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 账号
	 */
	private String account;
	
	/**
	 * 登录IP
	 */
	private String loginIp;
	
	/**
	 * 登录时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date loginTime;
	
	
	
}