package com.qaz.esip.ax.common.exception;

import java.util.Map;

public class DbspFlowException extends RuntimeException{

    private String errCode;
    private String errMsg;
    private Map errAddMsg;

    public DbspFlowException(String errCode){
        this.errCode = errCode;
    }

    public DbspFlowException(String message,String errCode){
        super(message);
        this.errCode = errCode;
        this.errMsg = message;
    }

    public DbspFlowException(String message,String errCode,Map errAddMsg){
        super(message);
        this.errCode = errCode;
        this.errMsg = message;
        this.errAddMsg = errAddMsg;
    }

    public DbspFlowException(Throwable cause,String errCode){
        super(cause);
        this.errCode = errCode;
    }

    public DbspFlowException(String message,Throwable cause,boolean enableSuppression,boolean writableStackTrace,String errCode){
        super(message, cause, enableSuppression, writableStackTrace);
        this.errCode = errCode;
        this.errMsg = message;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Map getErrAddMsg() {
        return errAddMsg;
    }

    public void setErrAddMsg(Map errAddMsg) {
        this.errAddMsg = errAddMsg;
    }


}
