package com.zom.common.dao.mapper;

import com.zom.common.dao.po.StaUserPhotoRecord;

import java.util.List;
import java.util.Map;

/**
 * @author yuronghua-airson
 * @description Mybatis Mapper: StaUserPhotoRecord
 * @template 2019.08.02 v11.0
 * @organization Zero One More, Inc. http://www.01more.com
 * @remark 照片回传记录表
 * @time 2020-09-18 13:57:23
 */
public interface StaUserPhotoRecordMapper {

    // select methods

    StaUserPhotoRecord load(long id);

    StaUserPhotoRecord selectByPrimaryKey(long id);

    List<StaUserPhotoRecord> selectListByCondition(Map<String, Object> map);

    StaUserPhotoRecord selectByCondition(Map<String, Object> map);

    Long selectCountByCondition(Map<String, Object> map);

    // update methods

    int updateByPrimaryKey(StaUserPhotoRecord staUserPhotoRecord);

    int updateByPrimaryKeySelective(StaUserPhotoRecord staUserPhotoRecord);

    // insert methods

    int insert(StaUserPhotoRecord staUserPhotoRecord);

    int insertSelective(StaUserPhotoRecord staUserPhotoRecord);

    int insertBatch(List<StaUserPhotoRecord> staUserPhotoRecord);

    // delete methods

    int deleteByPrimaryKey(long id);

}