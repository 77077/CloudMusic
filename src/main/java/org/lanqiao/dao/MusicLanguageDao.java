package org.lanqiao.dao;

import org.lanqiao.entity.MusicLanguage;

public interface MusicLanguageDao {
    int deleteByPrimaryKey(Integer languageId);

    int insert(MusicLanguage record);

    int insertSelective(MusicLanguage record);

    MusicLanguage selectByPrimaryKey(Integer languageId);

    int updateByPrimaryKeySelective(MusicLanguage record);

    int updateByPrimaryKey(MusicLanguage record);
}