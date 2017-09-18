package org.lanqiao.dao;

import org.lanqiao.entity.MusicStyle;

public interface MusicStyleDao {
    int deleteByPrimaryKey(Integer styleId);

    int insert(MusicStyle record);

    int insertSelective(MusicStyle record);

    MusicStyle selectByPrimaryKey(Integer styleId);

    int updateByPrimaryKeySelective(MusicStyle record);

    int updateByPrimaryKey(MusicStyle record);
}