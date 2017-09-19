package org.lanqiao.service;

import org.lanqiao.entity.Music;

public interface MusicDetailService {
	Music SelectMusicById(int musicId);//根据歌曲ID查找歌曲信息
}
