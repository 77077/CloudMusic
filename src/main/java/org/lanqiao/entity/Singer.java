package org.lanqiao.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Singer {
    private Integer singerId;

    private String singerName;

    private String singerInfo;

    private String singerImage;

    //private Integer singerAreaId;
    @Autowired
	private SingerArea singerArea;
    
    //private Integer singerKindId;
    @Autowired
	private SingerKind singerKind;
    
    
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

	public SingerArea getSingerArea() {
		return singerArea;
	}

	public void setSingerArea(SingerArea singerArea) {
		this.singerArea = singerArea;
	}

	public SingerKind getSingerKind() {
		return singerKind;
	}

	public void setSingerKind(SingerKind singerKind) {
		this.singerKind = singerKind;
	}

}