package org.lanqiao.dao;

import org.lanqiao.entity.PlayNumber;

public interface PlayNumberDao {
    int insert(PlayNumber record);

    int insertSelective(PlayNumber record);
}