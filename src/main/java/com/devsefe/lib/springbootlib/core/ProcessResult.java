package com.devsefe.lib.springbootlib.core;

import org.springframework.stereotype.Component;

@Component
public class ProcessResult {

    public String errorMsg;

    public Object returnObject;

    public ProcessResultType resultType;

    public ProcessResult() {
        resultType = ProcessResultType.Succeeded;
    }

    public boolean isSucceeded() {
        return resultType == ProcessResultType.Succeeded;
    }

    public <T> void setSucceeded(T obj) {
        this.resultType = ProcessResultType.Succeeded;
        this.returnObject = obj;
    }

    public void setSysError(Exception ex) {
        this.resultType = ProcessResultType.SystemError;
        this.errorMsg = ex.getMessage();
    }

    public void setLogicError(String msg) {
        this.resultType = ProcessResultType.LogicError;
        this.errorMsg = msg;
    }
}