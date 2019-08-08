package com.zom.common.dao.po;

import java.util.Date;
import java.math.BigDecimal;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;

/**
 * @author yuronghua-airson
 * @description PO: RolePlanRole
 * @template 2019.08.02 v11.0
 * @organization Zero One More, Inc. http://www.01more.com
 * @remark 角色
 * @time 2019-08-07 15:16:28
 */
@Data
public class RolePlanRole {

	/**
	 * 
	 */
	private Long id;
	
	/**
	 * 角色方案唯一标识ID(数字)
	 */
	private Long rolePlanId;
	
	/**
	 * 角色唯一标识ID(数字)
	 */
	private Long uniqueId;
	
	/**
	 * 角色名称
	 */
	private String roleName;
	
	/**
	 * 角色顺序
	 */
	private String roleOrder;
	
	/**
	 * 状态：1启用，0停用，2删除
	 */
	private Integer state;
	
	/**
	 * 更新时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	
	/**
	 * 组织ID
	 */
	private Integer corpId;
	
	
	
}