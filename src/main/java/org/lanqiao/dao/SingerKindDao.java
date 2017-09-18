package org.lanqiao.dao;

import org.lanqiao.entity.SingerKind;

public interface SingerKindDao {
    int deleteByPrimaryKey(Integer singerKindId);

    int insert(SingerKind record);

    int insertSelective(SingerKind record);

    SingerKind selectByPrimaryKey(Integer singerKindId);

    int updateByPrimaryKeySelective(SingerKind record);

    int updateByPrimaryKey(SingerKind record);
}