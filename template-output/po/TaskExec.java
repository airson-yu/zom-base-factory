package com.zom.common.dao.po;

import java.util.Date;
import java.math.BigDecimal;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;

/**
 * @author yuronghua-airson
 * @description PO: TaskExec
 * @template 2019.08.02 v11.0
 * @organization Zero One More, Inc. http://www.01more.com
 * @remark 任务-执行调度台表
 * @time 2019-11-04 10:39:25
 */
@Data
public class TaskExec {

	/**
	 * 
	 */
	private Long id;
	
	/**
	 * 
	 */
	private Integer corpId;
	
	/**
	 * 任务ID
	 */
	private Long taskId;
	
	/**
	 * 执行的调度台ID
	 */
	private Long execConId;
	
	
	
}