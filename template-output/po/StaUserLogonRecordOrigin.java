package com.zom.common.dao.po;

import java.util.Date;
import java.math.BigDecimal;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;

/**
 * @author yuronghua-airson
 * @description PO: StaUserLogonRecordOrigin
 * @template 2019.08.02 v11.0
 * @organization Zero One More, Inc. http://www.01more.com
 * @remark 用户登录记录表
 * @time 2020-02-27 09:57:44
 */
@Data
public class StaUserLogonRecordOrigin {

	/**
	 * 表项主键
	 */
	private Long id;
	
	/**
	 * 组织ID
	 */
	private Integer corpid;
	
	/**
	 * 人员ID
	 */
	private Long uid;
	
	/**
	 * 人员姓名
	 */
	private String name;
	
	/**
	 * 业务产生时间：年月(202002)
	 */
	private String timeYm;
	
	/**
	 * 业务产生时间：年月日(20200208)
	 */
	private Integer timeYmd;
	
	/**
	 * 业务产生时间：年月日时(2020020809)
	 */
	private Integer timeYmdh;
	
	/**
	 * 部门ID
	 */
	private String deptUniqueId;
	
	/**
	 * 部门名称
	 */
	private String deptName;
	
	/**
	 * 登录时间（flag=1），登出时间（flag=2）
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date time;
	
	/**
	 * 是否绑定岗位：0否，1是
	 */
	private Integer bindDuty;
	
	/**
	 * 操作标识：1登录，2退出登录
	 */
	private Integer flag;
	
	/**
	 * 会话ID（非必填）
	 */
	private String session;
	
	/**
	 * 统计状态：1需要统计，2不需统计(领导数据)
	 */
	private Integer state;
	
	
	
}