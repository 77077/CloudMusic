package org.lanqiao.entity;

public class Music {
    private Integer musicId;

    private String musicName;

    private Integer singerId;

    private Integer musicStar;

    private String musicPath;

    private Integer languageId;

    private Integer styleId;

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

    public Integer getSingerId() {
        return singerId;
    }

    public void setSingerId(Integer singerId) {
        this.singerId = singerId;
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

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getStyleId() {
        return styleId;
    }

    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
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