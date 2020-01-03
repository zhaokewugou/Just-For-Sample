package com.sample.operation.service;

import com.sample.operation.entity.OperationHistory;

import java.util.Date;

public class OperationService {

    public OperationService() {
    }

    public OperationHistory getOperationHistory(String type) {
        OperationHistory operationHistory = new OperationHistory(001, 001);
        if ("add".equals(type)) {
            operationHistory.setOperationType(1);
            operationHistory.setOperationTime(new Date());
        } else if ("delete".equals(type)) {
            operationHistory.setOperationType(2);
            operationHistory.setOperationTime(new Date());
        } else if ("update".equals(type)) {
            operationHistory.setOperationType(3);
            operationHistory.setOperationTime(new Date());
        } else {
            operationHistory.setOperationType(4);
            operationHistory.setOperationTime(new Date());
        }
        return operationHistory;
    }
}
