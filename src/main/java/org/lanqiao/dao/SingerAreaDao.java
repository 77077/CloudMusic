package org.lanqiao.dao;

import org.lanqiao.entity.SingerArea;

public interface SingerAreaDao {
    int deleteByPrimaryKey(Integer singerAreaId);

    int insert(SingerArea record);

    int insertSelective(SingerArea record);

    SingerArea selectByPrimaryKey(Integer singerAreaId);

    int updateByPrimaryKeySelective(SingerArea record);

    int updateByPrimaryKey(SingerArea record);
}