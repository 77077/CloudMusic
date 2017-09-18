package org.lanqiao.dao;

import org.lanqiao.entity.MusicList;

public interface MusicListDao {
    int insert(MusicList record);

    int insertSelective(MusicList record);
}