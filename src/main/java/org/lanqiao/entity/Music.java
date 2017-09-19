package org.lanqiao.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Music {
	private Integer musicId;

	private String musicName;

	// private Integer singerId;
	@Autowired
	private Singer singer;

	private Integer musicStar;

	private String musicPath;

	// private Integer languageId;
	@Autowired
	private MusicLanguage musicLanguage;

	// private Integer styleId;
	@Autowired
	private MusicStyle musicStyle;

	private String musicImage;

	private String musicLrc;

	private Double musicTime;

	public Integer getMusicId() {
		return musicId;
	}

	public void setMusicId(Integer musicId) {
		this.musicId = musicId;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName == null ? null : musicName.trim();
	}

	public Singer getSinger() {
		return singer;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}

	public Integer getMusicStar() {
		return musicStar;
	}

	public void setMusicStar(Integer musicStar) {
		this.musicStar = musicStar;
	}

	public String getMusicPath() {
		return musicPath;
	}

	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath == null ? null : musicPath.trim();
	}

	public MusicLanguage getMusicLanguage() {
		return musicLanguage;
	}

	public void setMusicLanguage(MusicLanguage musicLanguage) {
		this.musicLanguage = musicLanguage;
	}

	public MusicStyle getMusicStyle() {
		return musicStyle;
	}

	public void setMusicStyle(MusicStyle musicStyle) {
		this.musicStyle = musicStyle;
	}

	public String getMusicImage() {
		return musicImage;
	}

	public void setMusicImage(String musicImage) {
		this.musicImage = musicImage == null ? null : musicImage.trim();
	}

	public String getMusicLrc() {
		return musicLrc;
	}

	public void setMusicLrc(String musicLrc) {
		this.musicLrc = musicLrc == null ? null : musicLrc.trim();
	}

	public Double getMusicTime() {
		return musicTime;
	}

	public void setMusicTime(Double musicTime) {
		this.musicTime = musicTime;
	}
}