package org.lanqiao.entity;

public class MusicLanguage {
    private Integer languageId;

    private String languageKind;

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getLanguageKind() {
        return languageKind;
    }

    public void setLanguageKind(String languageKind) {
        this.languageKind = languageKind == null ? null : languageKind.trim();
    }
}