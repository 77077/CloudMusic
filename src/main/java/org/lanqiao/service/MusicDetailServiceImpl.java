package org.lanqiao.service;

import org.lanqiao.dao.MusicDao;
import org.lanqiao.entity.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicDetailServiceImpl implements MusicDetailService {

	@Autowired
	MusicDao musicDao;
	
	@Override
	public Music SelectMusicById(int musicId) { //根据歌曲ID查找歌曲信息
		return musicDao.selectByPrimaryKey(musicId);
	}

}
