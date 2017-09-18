package org.lanqiao.dao;

import org.lanqiao.entity.Singer;

public interface SingerDao {
    int deleteByPrimaryKey(Integer singerId);

    int insert(Singer record);

    int insertSelective(Singer record);

    Singer selectByPrimaryKey(Integer singerId);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);
}