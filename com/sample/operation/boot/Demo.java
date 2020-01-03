package com.sample.operation.boot;

import com.sample.operation.controller.OperationController;
import com.sample.operation.entity.OperationHistory;
import com.sample.operation.service.OperationService;

public class Demo {

    public static void main(String[] args) {
        OperationService operationService = new OperationService();
        OperationController operationController = new OperationController(operationService);
        OperationHistory operationHistory = operationController.getOperationHistory("delete");
        System.out.println(operationHistory.getOperationType());
    }
}
