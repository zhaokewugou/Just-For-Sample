package com.sample.operation.entity;

import java.util.Date;

public class OperationHistory {

    private Integer historyId;
    private Integer pageId;
    private Integer operationType;
    private Date operationTime;

    public OperationHistory(Integer historyId, Integer pageId, Integer operationType, Date operationTime) {
        this.historyId = historyId;
        this.pageId = pageId;
        this.operationType = operationType;
        this.operationTime = operationTime;
    }

    public OperationHistory(Integer historyId, Integer pageId) {
        this.historyId = historyId;
        this.pageId = pageId;
    }

    public OperationHistory() {
    }

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

}
