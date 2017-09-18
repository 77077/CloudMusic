package org.lanqiao.entity;

public class SingerArea {
    private Integer singerAreaId;

    private String singerArea;

    public Integer getSingerAreaId() {
        return singerAreaId;
    }

    public void setSingerAreaId(Integer singerAreaId) {
        this.singerAreaId = singerAreaId;
    }

    public String getSingerArea() {
        return singerArea;
    }

    public void setSingerArea(String singerArea) {
        this.singerArea = singerArea == null ? null : singerArea.trim();
    }
}