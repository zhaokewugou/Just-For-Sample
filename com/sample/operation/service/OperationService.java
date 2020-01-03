package com.sample.operation.service;

import com.sample.operation.entity.OperationHistory;

import java.util.Date;

public class OperationService {

    public OperationService() {
    }

    public OperationHistory getOperationHistory(String type){
        OperationHistory OperationHistory = new OperationHistory(001, 001);
        if ("add".equals(type)) {
            OperationHistory.setOperationType(1);
            OperationHistory.setOperationTime(new Date());
        } else if("delete".equals(type)) {
            OperationHistory.setOperationType(2);
            OperationHistory.setOperationTime(new Date());
        } else if("update".equals(type)) {
            OperationHistory.setOperationType(3);
            OperationHistory.setOperationTime(new Date());
        }else{
            OperationHistory.setOperationType(4);
            OperationHistory.setOperationTime(new Date());
        }
        return OperationHistory;
    }
}
