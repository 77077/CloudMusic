package org.lanqiao.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class PlayNumber {
	// private Integer userId;
	@Autowired
	private User user;

	// private Integer musicId;
	@Autowired
	private Music music;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	private Integer listenCount;

	public Integer getListenCount() {
		return listenCount;
	}

	public void setListenCount(Integer listenCount) {
		this.listenCount = listenCount;
	}
}