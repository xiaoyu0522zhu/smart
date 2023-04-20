package com.qaz.esip.ax.common.constants;

/*
* 渠道枚举
* */
public enum ChannelEnum {

    CHANNEL_WEB("01","PC WEB"),
    CHANNEL_MOBILE("02","移动端"),
    CHANNEL_HX("03","航信端");

    private final String channelCode;
    private final String channelName;

    private ChannelEnum(String code,String name){
        this.channelCode=code;
        this.channelName=name;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public String getChannelName() {
        return channelName;
    }
}
