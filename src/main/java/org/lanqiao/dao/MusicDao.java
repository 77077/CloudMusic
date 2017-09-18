package org.lanqiao.dao;

import org.lanqiao.entity.Music;

public interface MusicDao {
    int deleteByPrimaryKey(Integer musicId);

    int insert(Music record);

    int insertSelective(Music record);

    Music selectByPrimaryKey(Integer musicId);

    int updateByPrimaryKeySelective(Music record);

    int updateByPrimaryKey(Music record);
}