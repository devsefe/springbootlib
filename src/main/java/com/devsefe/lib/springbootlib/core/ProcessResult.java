package com.devsefe.lib.springbootlib.core;

import org.springframework.stereotype.Component;

@Component
/*
  You can use this class for operations. When call a method, it can throw an exception. Instead of exception handling,
  handle exception in "setSysError", then check it at client with "isSucceeded" property.

  You can return a value in "returnObject". For example;
  You've done an insert operation, insert has finished as succeeded, after try block you can set entity value as returnObject.
  **/
public final class ProcessResult {

    /**
     * Custom error message
     * **/
    public String errorMsg;

    /**
     * Returning value after process
     * **/
    public Object returnObject;

    /**
     * Process result type
     * **/
    public ProcessResultType resultType;

    /**
     * Set process as succeeded at start
     * **/
    public ProcessResult() {
        resultType = ProcessResultType.Succeeded;
    }

    /**
     * Check if process finished as succeeded
     * **/
    public boolean isSucceeded() {
        return resultType == ProcessResultType.Succeeded;
    }

    /**
     * Set process as succeeded and set parameter to return object
     * @param obj returnObject value
     * **/
    public <T> void setSucceeded(T obj) {
        this.resultType = ProcessResultType.Succeeded;
        this.returnObject = obj;
    }

    /**
     * Set process as error
     * @param ex system exception
     * **/
    public void setSysError(Exception ex) {
        this.resultType = ProcessResultType.SystemError;
        this.errorMsg = ex.getMessage();
    }

    /**
     * Set process as logic (custom) error
     * @param msg your error message
     * **/
    public void setLogicError(String msg) {
        this.resultType = ProcessResultType.LogicError;
        this.errorMsg = msg;
    }
}