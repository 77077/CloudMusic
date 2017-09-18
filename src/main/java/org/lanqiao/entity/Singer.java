package org.lanqiao.entity;

public class Singer {
    private Integer singerId;

    private String singerName;

    private String singerInfo;

    private String singerImage;

    private Integer singerAreaId;

    private Integer singerKindId;

    public Integer getSingerId() {
        return singerId;
    }

    public void setSingerId(Integer singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName == null ? null : singerName.trim();
    }

    public String getSingerInfo() {
        return singerInfo;
    }

    public void setSingerInfo(String singerInfo) {
        this.singerInfo = singerInfo == null ? null : singerInfo.trim();
    }

    public String getSingerImage() {
        return singerImage;
    }

    public void setSingerImage(String singerImage) {
        this.singerImage = singerImage == null ? null : singerImage.trim();
    }

    public Integer getSingerAreaId() {
        return singerAreaId;
    }

    public void setSingerAreaId(Integer singerAreaId) {
        this.singerAreaId = singerAreaId;
    }

    public Integer getSingerKindId() {
        return singerKindId;
    }

    public void setSingerKindId(Integer singerKindId) {
        this.singerKindId = singerKindId;
    }
}