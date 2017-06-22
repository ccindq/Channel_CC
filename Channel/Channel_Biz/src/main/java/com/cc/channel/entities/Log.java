package com.cc.channel.entities;

public class Log {
    private Integer logId;

    private String operatorName;

    private String operatorTime;

    private String methodName;

    private String inputValue;

    private String ofType;

    private String outputValue;

    private String exceptionType;

    private String exceptionValue;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public String getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(String operatorTime) {
        this.operatorTime = operatorTime == null ? null : operatorTime.trim();
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue == null ? null : inputValue.trim();
    }

    public String getOfType() {
        return ofType;
    }

    public void setOfType(String ofType) {
        this.ofType = ofType == null ? null : ofType.trim();
    }

    public String getOutputValue() {
        return outputValue;
    }

    public void setOutputValue(String outputValue) {
        this.outputValue = outputValue == null ? null : outputValue.trim();
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType == null ? null : exceptionType.trim();
    }

    public String getExceptionValue() {
        return exceptionValue;
    }

    public void setExceptionValue(String exceptionValue) {
        this.exceptionValue = exceptionValue == null ? null : exceptionValue.trim();
    }

    @Override
    public String toString() {
        return "Log{" +
                "logId=" + logId +
                ", operatorName='" + operatorName + '\'' +
                ", operatorTime='" + operatorTime + '\'' +
                ", methodName='" + methodName + '\'' +
                ", inputValue='" + inputValue + '\'' +
                ", ofType='" + ofType + '\'' +
                ", outputValue='" + outputValue + '\'' +
                ", exceptionType='" + exceptionType + '\'' +
                ", exceptionValue='" + exceptionValue + '\'' +
                '}';
    }
}