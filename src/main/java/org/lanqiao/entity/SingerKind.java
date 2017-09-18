package org.lanqiao.entity;

public class SingerKind {
    private Integer singerKindId;

    private String singerKind;

    public Integer getSingerKindId() {
        return singerKindId;
    }

    public void setSingerKindId(Integer singerKindId) {
        this.singerKindId = singerKindId;
    }

    public String getSingerKind() {
        return singerKind;
    }

    public void setSingerKind(String singerKind) {
        this.singerKind = singerKind == null ? null : singerKind.trim();
    }
}