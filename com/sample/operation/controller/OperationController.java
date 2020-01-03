package com.sample.operation.controller;

import com.sample.operation.entity.OperationHistory;
import com.sample.operation.service.OperationService;

public class OperationController {

    private OperationService operationService;

    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    public OperationHistory getOperationHistory(String type){
        return operationService.getOperationHistory(type);
    }
}
