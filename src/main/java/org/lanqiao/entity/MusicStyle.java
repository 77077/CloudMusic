package org.lanqiao.entity;

public class MusicStyle {
    private Integer styleId;

    private String styleKind;

    public Integer getStyleId() {
        return styleId;
    }

    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }

    public String getStyleKind() {
        return styleKind;
    }

    public void setStyleKind(String styleKind) {
        this.styleKind = styleKind == null ? null : styleKind.trim();
    }
}