package org.lanqiao.entity;

public class PlayNumber {
    private Integer userId;

    private Integer musicId;

    private Integer listenCount;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public Integer getListenCount() {
        return listenCount;
    }

    public void setListenCount(Integer listenCount) {
        this.listenCount = listenCount;
    }
}